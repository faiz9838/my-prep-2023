import React, { useEffect, useState } from 'react'

const FetchData = () => {
    const [users, setUsers] = useState([])
    useEffect(() => {
        fetch("json/name.json").then((response) => response.json()).then((json) => setUsers(json));
    }, [])

    return (
        <div>
            {
                users.map((user) => (
                    <h4>{user.name}</h4>
                ))

            }
        </div>
    )
}

export default FetchData