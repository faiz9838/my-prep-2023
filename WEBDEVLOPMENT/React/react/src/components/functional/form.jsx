import React from 'react'
export default function Form(){
    return (
   <div className='form-wrapper'>
    <form >
        <h1 className="header">Login</h1>
        <input type="text" className='name' placeholder='Username'  autoFocus/>
        <input type="password" name="password" id="password" placeholder='password' required />
        <button className='btn' type='submit'>Submit</button>
    </form>
   </div>
    )
}
