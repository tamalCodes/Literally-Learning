import Link from "next/link";
import React from "react";

const Javascript = () => {
  return (
    <main>
      <h1 className="heading">Javascript</h1>

      <p className="w-[60%] mt-4 text-[20px] text-yellow-600 font-poppins">
        For the sake of simplicity i have divided the Javsacript into multiple
        sections based on the topics & personal choices. Click on the topic you
        want to learn.
      </p>

      <div className="mt-14 font-poppins flex flex-wrap gap-10">
        <Link href={"/js/arrays"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Arrays</h1>
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

export default Javascript;
