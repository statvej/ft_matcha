const Header = () => {
  return (
    <div className="bg-[url('https://i.ytimg.com/vi/nGBYEUNKPmo/sddefault.jpg')] bg-cover bg-center h-screen">
      <header className="bg-gray-800 p-4 text-white flex justify-around">
        <div className="flex justify-begin">
          <div className="flex justify-begin justify-items-center gap-10 pt-1 mr-10">
            <h2 className="text-xl text-zinc-400">Feeling lonely?</h2>
            <h2 className="text-xl text-violet-400">We can fix that.</h2>
          </div>
          <h1 className="ml-5 text-emerald-400 text-3xl font-bold mr-10">
            Matcha
          </h1>
        </div>
      </header>
    </div>
  );
};

export default Header;
