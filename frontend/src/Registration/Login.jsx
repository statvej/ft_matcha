import style from './Register.module.css';
import { Link } from "react-router-dom";
import { useState } from 'react';

const Login = () => {
  const [login, setLogin] = useState('');
  const [password, setPassword] = useState('');
  return (
    <div className={style.main}>
        <input type="text" placeholder="Username" value={login} onChange={(e) => setLogin(e.target.value)} className={style.topInput}/>
        <input type="password" placeholder="Password" value={password} onChange={(e) => setPassword(e.target.value)} className={style.bottomInput}/>
        <div className={style.buttons}>
            <button className={style.button}>Login</button>
            <button className={style.register}><Link to='/register'>Register now</Link></button>
        </div>
    </div>
  )
}

export default Login;