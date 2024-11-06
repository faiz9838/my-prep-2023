import React, { Component } from 'react'

export class Ternary extends Component {
    constructor(props){
        super(props)
        this.state = {
            isLoggedIn: true,
        }
    }
  render() {

    return (
      this.state.isLoggedIn ?
     ( <h3>Welcome Faiz Ahmad</h3>):
     ( <h3>Welcome guest</h3>)
    )
  }
}

export default Ternary