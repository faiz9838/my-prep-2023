import React, { useEffect, useState } from 'react'
import "./index.css";
import axios from 'axios'


function App() {

  const  [jokes , setJokes] = useState([])
  
  useEffect(async () =>{
     axios.get('/api/jokes').then((response) => {
      setJokes(response.data)
    }).catch((error) =>{
      console.log(error);
    })
  })


  return (

<>
<h1>jokes: {jokes.length}</h1>
{
  jokes.map((joke, index) => {
    <div key={joke.id}>
      <h3>{joke.content}</h3>
    </div>
  })
}
</>
  
  )
}

export default App