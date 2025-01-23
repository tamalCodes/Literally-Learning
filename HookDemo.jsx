import React, { useCallback, useState } from "react";

const HookDemo = () => {
  const [count, setCount] = useState(0);
  const [text, setText] = useState("Click me");

  // Without useCallback: Function is recreated on every render
  const handleClick = () => {
    setCount(count + 1);
  };

  // With useCallback: Function is only recreated when count changes
  const optimizedHandleClick = useCallback(() => {
    setCount((prevCount) => prevCount + 1);
  }, []); // No dependencies, so it remains the same function across renders

  return (
    <div>
      <button onClick={optimizedHandleClick}>{count}</button>
      <button onClick={() => setText("Updated")}>{text}</button>
    </div>
  );
};

export default HookDemo;
