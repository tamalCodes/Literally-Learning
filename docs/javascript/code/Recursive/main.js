function calculateFactorial(num) {
    if (num === 0) {
      // Base case: factorial of 0 is 1
      return 1;
    } else {
      // Recursive case: multiply the number with the factorial of (num - 1)
      return num * calculateFactorial(num - 1);
    }
  }
  
  // Test the function
  var input = 5;
  var output = calculateFactorial(input);
  console.log(output);  // Output: 120
  