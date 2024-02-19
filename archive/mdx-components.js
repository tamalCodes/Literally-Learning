export function useMDXComponents(components) {
  return {
    h1: (props) => (
      <h1 {...props}>
        <a href={`#${props.id}`}>{props.children}</a>
      </h1>
    ),

    h2: (props) => (
      <h2 {...props}>
        <a href={`#${props.id}`}>{props.children}</a>
      </h2>
    ),

    ...components,
  };
}
