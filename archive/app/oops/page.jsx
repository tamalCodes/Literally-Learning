import Link from "next/link";
import React from "react";

const Javascript = () => {
  return (
    <main>
      <h1 className="heading">OOPS</h1>

      <p className="w-[60%] mt-4 text-[20px] text-yellow-600 font-poppins">
        For the sake of simplicity i have divided the OOPS into multiple
        sections based on the topics & personal choices. Click on the topic you
        want to learn.
      </p>

      <div className="mt-14 font-poppins flex flex-wrap gap-10">
        <Link href={"/oops/basics"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Basics</h1>
        </Link>

        <Link href={"/oops/keywords"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Keywords</h1>
        </Link>

        <Link href={"/oops/methods"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Methods</h1>
        </Link>

        <Link href={"/oops/threads"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Threads</h1>
        </Link>

        <Link href={"/oops/misc"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Misc</h1>
        </Link>
      </div>
    </main>
  );
};

export default Javascript;
