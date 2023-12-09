import nextMDX from "@next/mdx";
import remarkGfm from "remark-gfm";
import remarkPrism from "remark-prism";
import rehypeSlug from "rehype-slug";

const withMDX = nextMDX({
  extension: /\.mdx?$/,
  options: {
    remarkPlugins: [remarkGfm, [remarkPrism, { transformInlineCode: true }]],
    rehypePlugins: [rehypeSlug],
  },
});

/** @type {import('next').NextConfig} */
const nextConfig = {
  pageExtensions: ["js", "jsx", "md", "mdx", "ts", "tsx"],
};

export default withMDX(nextConfig);
