export function Engines() {
  return (
    <div className="space-y-4 my-6">
      <details className="rounded-lg border p-4">
        <summary className="cursor-pointer font-semibold text-fd-primary">
          Just in Time compilation
        </summary>
        <div className="mt-3 space-y-3 text-sm leading-6">
          <p>
            JavaScript engines use a mix of interpreting and compiling. Code is
            interpreted into bytecode, while the compiler optimizes hot paths
            during execution.
          </p>
          <p>
            This gives a balance between fast startup and optimized runtime
            performance.
          </p>
        </div>
      </details>

      <details className="rounded-lg border p-4">
        <summary className="cursor-pointer font-semibold text-fd-primary">
          Ahead of time compilation
        </summary>
        <div className="mt-3 space-y-3 text-sm leading-6">
          <p>
            AOT compiles code before execution. Typical optimizations include
            inlining, dead code elimination, and other compile-time transforms.
          </p>
          <p>
            The result is optimized output that runs efficiently once deployed.
          </p>
        </div>
      </details>
    </div>
  );
}
