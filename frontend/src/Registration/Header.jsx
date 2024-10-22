const Header = () => {
  return (
      <header className="bg-violet-600 p-4 text-white flex justify-around animate-fadeIn1">
        <div className="flex justify-begin">
          <div className="flex justify-begin justify-items-center gap-10 pt-1 mr-10">
            <h2 className="text-xl text-zinc-300">Feeling lonely?</h2>
            <h2 className="text-xl text-violet-300">We can fix that.</h2>
          </div>
          <h1 className="ml-5 text-emerald-300 text-3xl font-bold mr-10">
            Matcha
          </h1>
        </div>
      </header>
  );
};

export default Header;
