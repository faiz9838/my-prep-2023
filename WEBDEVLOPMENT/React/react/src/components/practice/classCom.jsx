import React from 'react'


class ClassCom extends React.Component {
    constructor(props) {
        super(props)
    }
    render() {
        return <h1>Hello {this.props.name}</h1>
    }
}

export default ClassCom