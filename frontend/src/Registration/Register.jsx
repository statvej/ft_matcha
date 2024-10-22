import { Link } from 'react-router-dom';
import back from '../../back.png';

const Register = () => {
  return (
    <div className="bg-cover bg-gradient-to-b from-[#00f0ff] to-[#ff00f0] h-screen flex justify-center items-center">
      <div className="bg-white bg-opacity-80 p-10 rounded-xl shadow-2xl relative w-[400px] animate-fadeIn1">
      <button className='absolute top-4 left-4 z-30'>
          <Link to='/'>
            <img src={back} alt='Back' className='w-5 h-5'/>
          </Link>
        </button>
        {/* Depth Illusion effect */}
        <div className="absolute inset-0 bg-gradient-to-b from-purple-400 to-pink-600 blur-xl opacity-20 rounded-xl"></div>

        <h1 className="text-3xl text-center font-bold text-transparent bg-clip-text bg-gradient-to-r from-pink-500 to-purple-500 mb-8 relative">
          Register
        </h1>

        {/* Registration Form */}
        <form className="space-y-6 relative z-10">
          <div className="flex flex-col">
            <label className="text-lg font-semibold text-gray-700 mb-2">Name</label>
            <input
              type="text"
              placeholder="Enter your name"
              className="px-4 py-2 rounded-lg bg-gray-100 border-2 border-transparent focus:border-pink-500 focus:outline-none transition-all"
            />
          </div>

          <div className="flex flex-col">
            <label className="text-lg font-semibold text-gray-700 mb-2">Surname</label>
            <input
              type="text"
              placeholder="Enter your surname"
              className="px-4 py-2 rounded-lg bg-gray-100 border-2 border-transparent focus:border-pink-500 focus:outline-none transition-all"
            />
          </div>

          <div className="flex flex-col">
            <label className="text-lg font-semibold text-gray-700 mb-2">Sex</label>
            <select className="px-4 py-2 rounded-lg bg-gray-100 border-2 border-transparent focus:border-pink-500 focus:outline-none transition-all">
              <option value="male">Male</option>
              <option value="female">Female</option>
              <option value="other">Other</option>
            </select>
          </div>

          <div className="flex flex-col">
            <label className="text-lg font-semibold text-gray-700 mb-2">Age</label>
            <input
              type="number"
              minLength={18}
              min={18}
              max={100}
              placeholder="Enter your age"
              className="px-4 py-2 rounded-lg bg-gray-100 border-2 border-transparent focus:border-pink-500 focus:outline-none transition-all"
            />
          </div>

          <button
            type="submit"
            className="w-full py-3 bg-gradient-to-r from-pink-500 to-purple-500 text-white font-bold text-lg rounded-lg shadow-md hover:shadow-xl transform hover:scale-105 transition-all"
          >
            Next
          </button>
        </form>
      </div>
    </div>
  );
};

export default Register;
