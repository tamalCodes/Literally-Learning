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
      </div>
    </main>
  );
};

export default Javascript;
