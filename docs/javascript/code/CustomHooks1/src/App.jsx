import "./App.css";
import useCounter from "./useCounter";

function App() {
  const { count, increment, decrement, reset } = useCounter(100, 2);

  return (
    <>
      <div>
        <h1>Count: {count}</h1>
        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
        <button onClick={reset}>Reset</button>
      </div>
    </>
  );
}

export default App;
