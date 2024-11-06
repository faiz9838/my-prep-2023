import  { useState } from 'react'
import { FaGoogle } from 'react-icons/fa';

const Login = () => {

    const [gender, setGender] = useState("");
    const [date, setDate] = useState("");
  return (
    <div className='login'>
        <main>
            <h1>Login</h1>
            <div>
               <label>Gender</label>
                <select id="" value={gender} onChange={(e) => setGender(e.target.value)}>
                    <option value="">Select Gender</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                </select>
            </div>
            <div>
                <label>Date of birth</label>
                <input type="date" value={date} onChange={(e) => setDate(e.target.value)}/>
            </div>

            <div>
                <p>Already Signed In once</p>
                <button>
      <FaGoogle />
      <span>Sign in with Google</span>
    </button>
            </div>
        </main>
    </div>
  )
}

export default Login