function calculateSum(numbers) {
    var sum = 0;
    
    for (var i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    
    return sum;
  }
  
  // Test the function
  var input = [1, 2, 3, 4, 5];
  var output = calculateSum(input);
  console.log(output);  // Output: 15
  