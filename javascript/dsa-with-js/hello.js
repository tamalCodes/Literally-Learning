let arr = {
  a: "Tamal",
  b: "Das",
};

function sumup(c, d) {
  console.log(this.a + " " + this.b + " " + c + " " + d);
}

let helloworld2 = sumup.bind(arr, "Jeet", "Das");

helloworld2();
