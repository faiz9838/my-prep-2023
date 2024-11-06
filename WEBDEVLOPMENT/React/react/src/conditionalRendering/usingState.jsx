import React, { Component } from 'react'

export class UsingState extends Component {
    constructor(props){
        super(props)
        this.state = {
            isLoggedIn: true,
        }
    }
  render() {

    let output = null

    if(this.state.isLoggedIn){
        output = <h1>Logged In</h1>
    }
    else{
        output = <h1>Please login...</h1>
    }
    return (
      <div>
        <h3>{output}</h3>
      </div>
    )
  }
}

export default UsingState