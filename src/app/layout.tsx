import { RootProvider } from "fumadocs-ui/provider/next";
import "./global.css";
import type { Metadata } from "next";
import { Inter } from "next/font/google";
import localFont from "next/font/local";

const inter = Inter({
  subsets: ["latin"],
  variable: "--font-body",
});

const aeonikPro = localFont({
  src: [
    {
      path: "./fonts/AeonikPro-Regular.otf",
      weight: "400",
      style: "normal",
    },
    {
      path: "./fonts/AeonikPro-Bold.otf",
      weight: "700",
      style: "normal",
    },
  ],
  variable: "--font-title",
});

export const metadata: Metadata = {
  metadataBase: new URL("https://learn.tamal.codes"),
  title: {
    default: "Literally Learning",
    template: "%s | Literally Learning",
  },
  description: "Nothing fancy, just learning",
  icons: {
    icon: "/img/favicon.ico",
  },
};

export default function Layout({ children }: LayoutProps<"/">) {
  return (
    <html
      lang="en"
      className={`${inter.className} ${inter.variable} ${aeonikPro.variable}`}
      suppressHydrationWarning
    >
      <body className="flex flex-col min-h-screen">
        <RootProvider>{children}</RootProvider>
      </body>
    </html>
  );
}
