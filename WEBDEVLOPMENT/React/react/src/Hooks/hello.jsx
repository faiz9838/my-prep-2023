import React, { useState } from 'react'

const SaysHello = () => {
  const [text, setText] = useState('')


  return (
    <div style={{ margin: "20px" }}>
      <i><h1>{text}</h1></i>
      <input type="text" onChange={(e) => setText(e.target.value)} />

    </div>
  )
}

export default SaysHello