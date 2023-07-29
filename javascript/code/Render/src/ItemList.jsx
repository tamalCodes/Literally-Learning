import React, { useEffect, useState } from 'react';

const ItemList = () => {
  const [items, setItems] = useState([]);

  useEffect(() => {
    // Fetch data from the API endpoint
    fetch('http://localhost:3001/api/items')
      .then(response => response.json())
      .then(data => setItems(data))
      .catch(error => console.log(error));
  }, []);

  return (
    <div>
      <h2>Item List</h2>
      {items.length > 0 ? (
        <ul>
          {items.map(item => (
            <li key={item.id}>
              <h3>{item.name}</h3>
              <p>{item.description}</p>
            </li>
          ))}
        </ul>
      ) : (
        <p>Loading...</p>
      )}
    </div>
  );
};

export default ItemList;
