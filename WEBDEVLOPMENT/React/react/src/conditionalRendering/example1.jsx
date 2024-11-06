import React, { Component } from 'react'

export class IfElse extends Component {
    constructor(props){
        super(props)
    }
  render() {
    let output = null
      if(this.props.isLoggedIn){
       output = <h1>Login successfull</h1>
    }
    else{
        output = <h1>Please Login..</h1>
    }
    return (
      <div>
        <h3>{output}</h3>
      </div>
    )
  }
}

export default IfElse