import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ItemList from './ItemList'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <ItemList />
      </div>
    </>
  )
}

export default App
