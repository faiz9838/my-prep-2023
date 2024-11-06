import React from 'react'

class StudentData extends React.Component{
    constructor(props){
        super(props)
    }
    render(){


        return(
            <div className="data">
               <ul style={{textAlign:'start', listStyle:"none"}}>
                <li><strong>id:</strong>{this.props.item.id} </li>
                <li><strong>name:</strong>{this.props.item.name}</li>
                <li><strong>class:</strong>{this.props.item.class}</li>
               </ul> 
            </div>
        )
    }
}

export default StudentData