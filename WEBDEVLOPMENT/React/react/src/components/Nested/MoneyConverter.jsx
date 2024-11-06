import React, {Component} from "react";

class MoneyConverter extends Component{
    constructor(props){
        super(props)
        
    }

    converter( amount, type){
        let result = ''
            if(type == 'dollar'){
            result = `${amount} to ${type}: ${amount * 80}`
        }
        else if(type == 'can'){
             result = `${amount} to ${type}: ${amount * 37}`
        }
         else if(type == 'vit'){
             result = `${amount} to ${type}: ${amount * 4000}`
        }

        return result
    }

    render(){
        const {amount } = this.props
        const {type} = this.props
        return (
            <h2>{this.converter(amount, type)}</h2>
        )
    }
}

export default MoneyConverter