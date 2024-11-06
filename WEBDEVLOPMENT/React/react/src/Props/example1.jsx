import React from 'react'
function ExampleProps(props){
    return(
        <div>
           <h1 style={{background:'red'}}>This is Props </h1>
            <h2>Hello {props.user}</h2>
            
         </div>
    );
}
 
export default ExampleProps