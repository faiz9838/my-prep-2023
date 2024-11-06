import React from "react";
import PropType from 'prop-types'

class Sum extends React.Component{
    render(){
        return(
            <div>
                <h1>PropType Example</h1>
                <h2>Sum of {this.props.num1} and {this.props.num2} = {this.props.num1 + this.props.num2}</h2>
            </div>
        )
    }
}


Sum.PropType = {
    num1: PropType.number,
    num2: PropType.number
}

export default Sum 