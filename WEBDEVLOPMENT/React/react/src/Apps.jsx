import React from 'react'
import './App.css'
import SimpleCom from './components/practice/simpleCom'
import ClassCom from './components/practice/classCom'
import PureCom from './components/practice/pureCom'
import SimpleStates from './components/practice/simpleStates'
import LifeCycle from './components/practice/lifeCycle'
import UseStateEx from './components/practice/useState'
import LetterCounter from './Hooks/useState/LetterCounter'
import Timer from './Hooks/useEffect/Timer'
import Theme from './Hooks/useContext/Theme'
function Apps() {
    return (
        <div className='App'>
            <SimpleCom name="Tahoora shaikh" />
            <ClassCom name="faiz" />
            <PureCom />
            <SimpleStates />
            <LifeCycle />
            <UseStateEx />
            <LetterCounter />
            <Timer />

        </div>
    )
}

export default Apps