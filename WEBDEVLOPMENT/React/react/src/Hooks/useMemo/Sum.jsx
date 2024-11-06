import React from 'react'
import { useMemo, useState } from 'react'
const Summation = () => {
    const [limit, setLimit] = useState(10);

    const sum = useMemo(() => {
        var sum = 0;
        for (let index = 0; index <= limit; index++) {
            sum += index;

        }
        return sum
    }, [limit])

    return (
        <div>
            <div style={{ padding: "10px" }}>
                <input value={limit} onChange={(e) => { setLimit(e.target.value) }} />
                <h3>Summation of values from <i>1</i> to <i>{limit}</i>: <b>{sum}</b></h3>
            </div>
        </div>
    )
}

export default Summation