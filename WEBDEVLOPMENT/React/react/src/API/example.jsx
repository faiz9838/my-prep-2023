import React from "react";

class Clock extends React.Component{
    constructor(props){
        super(props)

        this.state = {
            date: new Date()
        }
    }

    componentDidMount(){
        this.setTimeRef = setInterval(() => this.setTime(), 1000)
    }

    componentWillUnmount(){
        clearInterval(this.setTimeRef)
    }


    setTime(){
        this.setState((state, props) =>{
            console.log(state.date)
            return {date: new Date()}
        })
    }

    render(){
        return(
            <div>
                <h2>Current time is: {this.state.date.toDateString()}</h2>
            </div>
        )
    }
}

export default Clock