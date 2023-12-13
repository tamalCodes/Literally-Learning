import { buttonVariants } from "@/components/ui/button";
import Link from "next/link";

export default function Home() {
  return (
    <main>
      <div className="flex gap-3 items-center">
        <div>
          <h1 className="heading">Tamal is still learning</h1>
          <p className="w-[60%] mt-4 text-[20px] text-yellow-600 font-poppins">
            Welcome to this mini site where i have structred alot of things in
            different tech stacks as i come across it and get asked in
            interviews and stuff.
          </p>
        </div>

        <Link
          href={"https://github.com/tamalCodes/literally-learning"}
          className={buttonVariants({ variant: "secondary", size: "lg" })}
          target="_blank"
        >
          Star us on GitHub
        </Link>
      </div>

      <div className="mt-14 font-poppins flex flex-wrap gap-10">
        <Link href={"/css"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">CSS</h1>
          <p className="text-[18px] ">
            Some CSS basics, tricks and fundamentals.
          </p>
        </Link>
        <Link href={"/js"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">JS</h1>
          <p className="text-[18px] ">
            Javascript fundamentals, machine coding, etc.
          </p>
        </Link>
        <Link href={"/go"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">Go</h1>
          <p className="text-[18px] ">
            Exploring and learning Golang to build more.
          </p>
        </Link>
        <Link href={"/oops"} className="card">
          <h1 className="heading text-[40px] text-yellow-600">OOPS</h1>
          <p className="text-[18px] ">
            Fundamentals of Object Oriented Programming that i must know.
          </p>
        </Link>
        <div className="card">
          <h1 className="heading text-[40px] text-yellow-600">LLD</h1>
          <p className="text-[18px] ">
            Some CSS tricks and fundamentals that are asked a lot in interviews.
          </p>
        </div>
        <div className="card">
          <h1 className="heading text-[40px] text-yellow-600">BE</h1>
          <p className="text-[18px] ">
            Backend related questions (Node, Express, DBs, etc.)
          </p>
        </div>
      </div>
    </main>
  );
}
