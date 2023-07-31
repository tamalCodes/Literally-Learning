import { useState } from "react";
import "./App.css";
import Parent from "./Parent";

function App() {
  const [id, setid] = useState(1);
  const [id2, setid2] = useState(1);

  const increment = () => {
    setid(id + 1);
  };

  return (
    <>
      <div>
        <button
          onClick={() => {
            increment();
          }}
        >
          Increment ID
        </button>

        <button
          onClick={() => {
            setid2(id2 + 1);
          }}
        >
          Increment ID2
        </button>

        <Parent id={id} id2={id2} />
      </div>
    </>
  );
}

export default App;
