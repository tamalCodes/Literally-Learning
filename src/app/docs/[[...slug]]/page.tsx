import {
  DocsBody,
  DocsDescription,
  DocsPage,
  DocsTitle,
} from "fumadocs-ui/layouts/docs/page";
import { createRelativeLink } from "fumadocs-ui/mdx";
import type { Metadata } from "next";
import { notFound } from "next/navigation";
import { LLMCopyButton, ViewOptions } from "@/components/ai/page-actions";
import { getPageImage, source } from "@/lib/source";
import { getMDXComponents } from "@/mdx-components";

export default async function Page(props: PageProps<"/docs/[[...slug]]">) {
  const params = await props.params;
  const page = source.getPage(params.slug);
  if (!page) notFound();
  const isOverviewPage =
    page.path.endsWith("index.mdx") || page.path.endsWith("index.md");

  const MDX = page.data.body;
  const gitConfig = {
    user: "tamalCodes",
    repo: "Literally-Learning",
    branch: "main",
  };

  return (
    <DocsPage
      toc={page.data.toc}
      full={page.data.full}
      footer={{ enabled: !isOverviewPage }}
      tableOfContent={{ enabled: !isOverviewPage, style: "clerk" }}
      tableOfContentPopover={{ enabled: !isOverviewPage, style: "clerk" }}
    >
      <DocsTitle className="text-title font-aeonik-pro">
        {page.data.title}
      </DocsTitle>
      <DocsDescription className="mb-0">
        {page.data.description}
      </DocsDescription>
      {!isOverviewPage && (
        <div className="flex flex-row gap-2 items-center border-b pb-6">
          <LLMCopyButton markdownUrl={`${page.url}.mdx`} />
          <ViewOptions
            markdownUrl={`${page.url}.mdx`}
            githubUrl={`https://github.com/${gitConfig.user}/${gitConfig.repo}/blob/${gitConfig.branch}/content/docs/${page.path}`}
          />
        </div>
      )}
      <DocsBody className={isOverviewPage ? "grow-0 docs-content" : "docs-content"}>
        <MDX
          components={getMDXComponents({
            // this allows you to link to other pages with relative file paths
            a: createRelativeLink(source, page),
          })}
        />
      </DocsBody>
    </DocsPage>
  );
}

export async function generateStaticParams() {
  return source.generateParams();
}

export async function generateMetadata(
  props: PageProps<"/docs/[[...slug]]">,
): Promise<Metadata> {
  const params = await props.params;
  const page = source.getPage(params.slug);
  if (!page) notFound();

  return {
    title: page.data.title,
    description: page.data.description,
    openGraph: {
      images: getPageImage(page).url,
    },
  };
}
