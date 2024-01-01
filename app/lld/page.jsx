import Link from "next/link";

const LLD = () => {
  return (
    <main>
      <h1 className="heading">Low Level Design</h1>

      <p className="subheading">
        For the sake of simplicity i have divided the Javascript into multiple
        sections based on the topics & personal choices. Click on the topic you
        want to learn.
      </p>

      <div className="card_container">
        <Link href={"/lld/solid"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">
            Solid Principle
          </h1>
        </Link>

        <Link href={"/lld/strategy"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">
            Strategy Design
          </h1>
        </Link>

        <Link href={"/lld/observer"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">
            Observer Design
          </h1>
        </Link>

        <Link href={"/lld/decorator"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">
            Decorator Design
          </h1>
        </Link>
      </div>
    </main>
  );
};

export default LLD;
