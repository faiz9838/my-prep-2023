import React, { Component } from 'react'

export default class Initialization extends Component {
    constructor(props){
        super(props)
        this.state = {
            name: "Faiz Ahmad",
        }
    }
  render() {
    return (
     <div>
        <h1>My name is: {this.state.name}</h1>
     </div>
    )
  }
}
