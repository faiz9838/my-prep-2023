import React from 'react'

const ThemeContext = React.createContext("light")
const Theme = () => {
    const theme = useContext(ThemeContext)
    return (
        <div>
            <button style={{ background: theme === 'dark' ? '#333' : '#fff' }}>Theme</button>
        </div>
    )
}

export default Theme