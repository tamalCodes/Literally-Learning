const fs = require('fs');

const inputFile = 'input.json';
const outputFile = 'output.json';

fs.readFile(inputFile, 'utf8', (err, data) => {
  if (err) {
    console.error('Error reading the input file:', err);
    return;
  }

  try {
    const jsonArray = JSON.parse(data);
    const sortedArray = jsonArray.sort((a, b) => a.age - b.age);
    const sortedJson = JSON.stringify(sortedArray, null, 2);

    fs.writeFile(outputFile, sortedJson, 'utf8', err => {
      if (err) {
        console.error('Error writing to the output file:', err);
        return;
      }

      console.log(`Successfully sorted and saved to ${outputFile}.`);
    });
  } catch (err) {
    console.error('Error parsing the input JSON:', err);
  }
});
