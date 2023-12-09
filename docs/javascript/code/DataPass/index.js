import React, { useState } from 'react';

const ParentComponent = () => {
  const [dataFromChild, setDataFromChild] = useState('');

  const handleDataFromChild = (data) => {
    setDataFromChild(data);
  };

  return (
    <div>
      <h2>Parent Component</h2>
      <ChildComponent sendDataToParent={handleDataFromChild} />
      {dataFromChild && <p>Data from Child: {dataFromChild}</p>}
    </div>
  );
};

const ChildComponent = ({ sendDataToParent }) => {
  const [inputData, setInputData] = useState('');

  const handleInputChange = (event) => {
    setInputData(event.target.value);
  };

  const sendData = () => {
    sendDataToParent(inputData);
  };

  return (
    <div>
      <h3>Child Component</h3>
      <input type="text" value={inputData} onChange={handleInputChange} />
      <button onClick={sendData}>Send Data to Parent</button>
    </div>
  );
};

export default ParentComponent;
