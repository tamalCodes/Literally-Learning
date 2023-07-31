import { useState } from 'react';

const useCounter = (initialValue, step) => {
    const [count, setCount] = useState(initialValue);

    const increment = () => {
        setCount((prevCount) => prevCount + step);
    };

    const decrement = () => {
        setCount((prevCount) => prevCount - step);
    };

    const reset = () => {
        setCount(initialValue);
    };

    return {
        count,
        increment,
        decrement,
        reset,
    };
};

export default useCounter;
