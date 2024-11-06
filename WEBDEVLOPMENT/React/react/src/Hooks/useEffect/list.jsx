import React, { useEffect, useState } from 'react'

const List = () => {

    const [data, setData] = useState([])
    const [isLoading, setLoading] = useState([])

    useEffect(() => {
        setTimeout(() => {
            fetch("json/name.json")
            .then((res) => res.json())
            .then((json) => {
                console.log(json);
                setLoading(false);
                setData(json);
            })
        }, 2000)
    })

  return (
     <div>
         {isLoading && <span>loading...</span>}
         {!isLoading && data && <span>Popular names: </span>}
         {!isLoading && data && data.map((item) =>
            <span key={item.id}>{item.name} </span>
         )}
      </div>
  )
}

export default List