import React from "react";

function Child({ id2 }) {
  console.log("Child Render");
  return <div>The ID2 is {id2}</div>;
}

export default React.memo(Child);
