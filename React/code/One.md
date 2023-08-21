# Why won't this code work ? 

```jsx
import { useRef } from 'react';

function MyCustomInput(props) {
  return <input {...props} />;
}

export default function MyCustomForm() {
  const inputRef = useRef(null);

  function handleInputFocus() {
    inputRef.current.focus();
  }

  return (
    <>
      <MyCustomInput ref={inputRef} />
      <button onClick={handleInputFocus}>
        Click Me
      </button>
    </>
  );
```

## Answer

The reason this code won't work is because the `ref` prop is not being passed down to the `input` element. We can fix this by adding the `ref` prop to the `input` element in the `MyCustomInput` component.

```jsx
import { useRef } from 'react';

function MyCustomInput(props) {
  return <input {...props} ref={props.ref} />;
}

export default function MyCustomForm() {
  const inputRef = useRef(null);

  function handleInputFocus() {
    inputRef.current.focus();
  }

  return (
    <>
      <MyCustomInput ref={inputRef} />
      <button onClick={handleInputFocus}>
        Click Me
      </button>
    </>
  );
}
```
