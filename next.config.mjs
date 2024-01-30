import nextMDX from "@next/mdx";
import rehypeSlug from "rehype-slug";
import remarkGfm from "remark-gfm";
import remarkPrism from "remark-prism";

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
  images: {
    domains: ["miro.medium.com", "imgur.com", "i.imgur.com","media.geeksforgeeks.org"],
  },
};

export default withMDX(nextConfig);
