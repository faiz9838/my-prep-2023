import React from "react";

class GreetingMessage extends React.Component{
    constructor(props){
        super(props)

        this.state = {
            welcomeMessage: "Hello"
        }

        this.changeMessageHnadler = this.changeMessageHnadler.bind(this)
    }

    changeMessageHnadler(){
        this.setState(prevState => ({
            welcomeMessage: prevState.welcomeMessage == "Hello"? "Welcome": "Hello"
        }))
    }

    render(){
        return(
            <div>
                <h3>{this.state.welcomeMessage}, {this.props.name}</h3>
                <button onClick={this.changeMessageHnadler}>Change meassge</button>
            </div>
        )
    }
}

export default GreetingMessage