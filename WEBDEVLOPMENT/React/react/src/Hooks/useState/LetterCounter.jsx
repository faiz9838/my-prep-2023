import React from 'react'
import { useState } from 'react'
const LetterCounter = () => {
    const [text, setText] = useState("")

    const handler = (e) => {
        setText(e.target.value)
    }
    return (
        <div>
            <input value={text} onChange={handler} />
            <p>{text.length}</p>
        </div>
    )
}

export default LetterCounter