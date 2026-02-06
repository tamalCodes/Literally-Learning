import { createMDX } from "fumadocs-mdx/next";

const withMDX = createMDX();

/** @type {import('next').NextConfig} */
const config = {
  reactStrictMode: true,
  images: {
    remotePatterns: [
      {
        protocol: "https",
        hostname: "media.geeksforgeeks.org",
      },
    ],
  },
  async redirects() {
    return [
      {
        source: "/category/javascript",
        destination: "/docs/js",
        permanent: true,
      },
      {
        source: "/category/react",
        destination: "/docs/react",
        permanent: true,
      },
      { source: "/category/oops", destination: "/docs/oops", permanent: true },
      { source: "/category/css", destination: "/docs/css", permanent: true },
      { source: "/intro", destination: "/docs", permanent: true },
      { source: "/js/:path*", destination: "/docs/js/:path*", permanent: true },
      {
        source: "/react/:path*",
        destination: "/docs/react/:path*",
        permanent: true,
      },
      {
        source: "/oops/:path*",
        destination: "/docs/oops/:path*",
        permanent: true,
      },
      {
        source: "/css/:path*",
        destination: "/docs/css/:path*",
        permanent: true,
      },
    ];
  },
  async rewrites() {
    return [
      {
        source: "/docs/:path*.mdx",
        destination: "/llms.mdx/docs/:path*",
      },
    ];
  },
};

export default withMDX(config);
