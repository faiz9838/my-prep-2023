import React, { useState } from 'react'

const FormValidation = () => {
    const [username, setUserName] = useState('');
    const [password, setPassword] = useState('');

    let isEmpty = (value) =>{
        if(value == null || value == ''){
            return true;

        }
        else{
            return false;
        }
    }

    let validate = (e) => {
        e.preventDefault()

        if(!isEmpty(username) && !isEmpty(password)){
            alert(JSON.stringify({
                username:username,
                password:password
            }))
        }
        else{
            alert("Please enter username/password")
        }
    }
  return (
    <div>
        <form name='loginForm'>
           <input type="text" id='username' name='username' value={username} onChange={(e) => setUserName(e.target.value) } />
           <input type="text" id='password' name='password' value={password} onChange={(e) => setPassword(e.target.value) } />

           <button type='submit' onClick={(e) => validate(e)}>Submit</button>
        </form>
    </div>
  )
}

export default FormValidation