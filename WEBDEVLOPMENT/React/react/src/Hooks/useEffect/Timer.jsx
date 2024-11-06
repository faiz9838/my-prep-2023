import React, { useEffect, useState } from 'react'

const Timer = () => {
    const [second, setSecond] = useState(0)

    useEffect(() => {
        let interval = setInterval((e) => {
            setSecond(second => second + 1)
        }, 10000)


        return () => clearInterval(interval)
    }, [])
    return (
        <div>
            <h4>You have only {second} seconds left</h4>
        </div>
    )
}

export default Timer