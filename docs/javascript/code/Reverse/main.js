function reverseString(str) {
    // Split the string into an array of characters, reverse the array, and join the characters back into a string
    return str.split('').reverse().join('');
  }
  
  // Test the function
  var input = "Hello World";
  var output = reverseString(input);
  console.log(output);  // Output: "dlroW olleH"
  