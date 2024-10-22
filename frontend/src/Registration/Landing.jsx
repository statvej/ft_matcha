import Header from "./Header";
import Login from "./Login";

const Landing = () => {
  return (
    <div className="bg-cover bg-gradient-to-b from-[#00f0ff] to-[#ff00f0] h-screen">
        <Header />
        <main className='flex justify-center justify-items-center mt-40 animate-fadeIn2'>
            <Login />
        </main>
    </div>
  )
}

export default Landing;