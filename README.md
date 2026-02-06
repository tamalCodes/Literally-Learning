# Literally Learning

This repository now runs on [Fumadocs](https://fumadocs.dev/) with Next.js.

Run development server:

```bash
npm run dev
# or
pnpm dev
# or
yarn dev
```

Open `http://localhost:3000` with your browser to see the result.

## Explore

In the project:

- `content/docs`: Documentation content and navigation (`meta.json`).
- `src/lib/source.ts`: Fumadocs content source adapter.
- `src/lib/layout.shared.tsx`: Shared layout options (navbar title + links).

| Route                     | Description                                            |
| ------------------------- | ------------------------------------------------------ |
| `app/(home)`              | The route group for your landing page and other pages. |
| `app/docs`                | The documentation layout and pages.                    |
| `app/api/search/route.ts` | The Route Handler for search.                          |

## Fumadocs MDX

The `source.config.ts` file controls MDX collection settings and schemas.

Read the [Introduction](https://fumadocs.dev/docs/mdx) for further details.

## Learn More

To learn more about Next.js and Fumadocs, take a look at the following
resources:

- [Next.js Documentation](https://nextjs.org/docs) - learn about Next.js
  features and API.
- [Learn Next.js](https://nextjs.org/learn) - an interactive Next.js tutorial.
- [Fumadocs](https://fumadocs.dev) - Fumadocs documentation
