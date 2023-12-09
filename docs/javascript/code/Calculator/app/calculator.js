exports.calculate = function(expression) {
  let tokens = expression.split(" ");
  function evaluate(tokens) {
    let token = tokens.shift();

    if (token === "+" || token === "-" || token === "*" || token === "/") {
      let operand1 = evaluate(tokens);
      let operand2 = evaluate(tokens);
      switch (token) {
        case "+":
          return operand1 + operand2;
        case "-":
          return operand1 - operand2;
        case "*":
          return operand1 * operand2;
        case "/":
          return operand1 / operand2;
      }
    } else {
      return parseFloat(token);
    }
  }

  return evaluate(tokens);
};
