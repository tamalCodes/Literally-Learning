import Link from "next/link";

const GoLang = () => {
  return (
    <main>
      <h1 className="heading">GoLang</h1>

      <p className="subheading">
        For the sake of simplicity i have divided GoLang into multiple sections
        based on the topics & personal choices. Click on the topic you want to
        learn.
      </p>

      <div className="card_container">
        <Link href={"/go/introduction"} className="card">
          <h1 className="heading text-[40px] text-yellow-600 break-all">
            Introduction
          </h1>
        </Link>
      </div>
    </main>
  );
};

export default GoLang;
