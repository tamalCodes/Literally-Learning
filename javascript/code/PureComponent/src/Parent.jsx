import React from "react";
import Child from "./Child";

const Parent = ({ id, id2 }) => {
  console.log("Parent Render");

  return (
    <>
      <h1>ID is {id} </h1>
      <Child id2={id2} />
    </>
  );
};

export default Parent;
