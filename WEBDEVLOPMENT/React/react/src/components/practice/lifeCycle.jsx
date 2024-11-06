import React from 'react'

class LifeCycle extends React.Component {
    constructor(props) {
        super(props)
    }

    componentDidMount() {
        console.log('Component mounted');
    };

    componentWillUnmount() {
        console.log('Component will unmount');
    }

    componentDidUpdate() {
        return true
    }

    render() {
        return <h1>Life cycle</h1>
    }
}


export default LifeCycle