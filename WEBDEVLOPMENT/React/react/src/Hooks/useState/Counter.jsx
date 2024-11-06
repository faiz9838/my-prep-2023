import React, { useState } from 'react'

const Counter = () => {
  const [count, setCount] = useState(0);

  const decreament = () => {
    setCount(prevCount => prevCount - 1)
  }

  const increament = () => {
    setCount(prevCount => prevCount + 1)
  }
  return (
    <div>
      <button onClick={decreament}>-</button>
      <span>{count}</span>
      <button onClick={increament}>+</button>
    </div>
  )
}

export default Counter