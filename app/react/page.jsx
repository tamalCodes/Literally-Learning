import Link from "next/link";

const ReactTutorial = () => {
  return (
    <main>
      <div className="flex flex-col gap-3 items-center xl:flex-row xl:items-start">
        <div>
          <h1 className="heading">React Js</h1>
          <p className="subheading">
            For the sake of simplicity i have divided it into multiple sections
            based on the topics & personal choices. Click on the topic you want
            to learn.
          </p>
        </div>

        <Link
          href={"https://github.com/tamalCodes/literally-learning"}
          class="box-border relative z-30 inline-flex items-center justify-center w-[280px] px-8 py-3 overflow-hidden font-medium text-white transition-all duration-300 bg-indigo-600 rounded-md cursor-pointer group ring-offset-2 ring-1 ring-indigo-300 ring-offset-indigo-200 hover:ring-offset-indigo-500 ease focus:outline-none font-poppins"
        >
          <span class="absolute bottom-0 right-0 w-8 h-20 -mb-8 -mr-5 transition-all duration-300 ease-out transform rotate-45 translate-x-1 bg-white opacity-10 group-hover:translate-x-0"></span>
          <span class="absolute top-0 left-0 w-20 h-8 -mt-1 -ml-12 transition-all duration-300 ease-out transform -rotate-45 -translate-x-1 bg-white opacity-10 group-hover:translate-x-0"></span>
          <span class="relative z-20 flex items-center text-sm">
            <svg
              class="relative w-5 h-5 mr-2 text-white"
              fill="none"
              stroke="currentColor"
              viewBox="0 0 24 24"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M13 10V3L4 14h7v7l9-11h-7z"
              ></path>
            </svg>
            Amazing blogs
          </span>
        </Link>
      </div>

      <div className="card_container">
        <Link href={"/react/abc(s)-of-react"} className="card">
          <h1 className="heading text-[40px] text-yellow-600 ">
            ABCs of React
          </h1>
        </Link>
        <Link href={"/react/hooks"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Hooks</h1>
        </Link>
      </div>
    </main>
  );
};

export default ReactTutorial;
