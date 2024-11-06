import React from 'react'

class Welcome extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            welcomeMessage: "Hello"
        }
    }
    render(){
        return(
            <div>
                <h1>State and SetState</h1>
                <h2>{this.state.welcomeMessage}, {this.props.name} welcome to webpage.</h2>
            </div>
        )
    }
}

export default Welcome