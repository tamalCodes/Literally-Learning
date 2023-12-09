const prompt = require("prompt")
const calculator = require("./app/calculator");

console.log(
  "Alternative calculator\n===\n\n" +
  "Enter an expression to calculate - e.g. '/ 6 + 1 1'.\n\n" +
  "Enter 'exit' to quit.\n\n"
);

function calculateUserInput() {
  prompt.get("expression", function(err, result) {
    if (result.expression.toLowerCase() != "exit") {
      console.log(calculator.calculate(result.expression));
      calculateUserInput();
    }
  });
}

calculateUserInput();

