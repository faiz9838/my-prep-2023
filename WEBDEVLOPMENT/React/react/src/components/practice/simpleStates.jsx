import React from "react";

class SimpleStates extends React.Component {
    constructor(props) {
        super(props)
        this.state = { color: "red" }

    }

    render() {
        return <h1>car color is: {this.state.color}</h1>
    }
}

export default SimpleStates