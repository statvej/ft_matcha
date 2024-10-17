import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Register from './Registration/Register';
import Landing from './Registration/Landing';


const App = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Landing />} />
        <Route path="/register" element={<Register />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App;