import type { BaseLayoutProps } from "fumadocs-ui/layouts/shared";

export function baseOptions(): BaseLayoutProps {
  return {
    nav: {
      title: "Learn",
    },
    links: [{ text: "GitHub", url: "https://github.com/tamalCodes" }],
  };
}
