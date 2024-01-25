import Link from "next/link";

const ReactTutorial = () => {
  return (
    <main>
      <h1 className="heading">React Js</h1>

      <p className="subheading">
        For the sake of simplicity i have divided it into multiple sections
        based on the topics & personal choices. Click on the topic you want to
        learn.
      </p>

      <div className="card_container">
        <Link href={"/react/hooks"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Hooks</h1>
        </Link>

        <Link href={"/js/promises"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Promises</h1>
        </Link>

        <Link href={"/js/browsers"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Browsers</h1>
        </Link>

        <Link href={"/js/closures"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Closures</h1>
        </Link>

        <Link href={"/js/engine"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Engine</h1>
        </Link>

        <Link href={"/js/functions"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Functions</h1>
        </Link>

        <Link href={"/js/events"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Events</h1>
        </Link>

        <Link href={"/js/hoisting"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Let/Var</h1>
        </Link>

        <Link href={"/js/debthro"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Debounce</h1>
        </Link>

        <Link href={"/js/objects"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Objects</h1>
        </Link>

        <Link href={"/js/misc"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Misc</h1>
        </Link>
      </div>
    </main>
  );
};

export default ReactTutorial;
