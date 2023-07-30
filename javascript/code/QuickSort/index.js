function quickSort(arr) {
    if (arr.length <= 1) return arr;
  
    const pivot = arr[0];
    const left = [];
    const right = [];
  
    for (let i = 1; i < arr.length; i++) {
      if (arr[i] < pivot) {
        left.push(arr[i]);
      } else {
        right.push(arr[i]);
      }
    }
  
    return [...quickSort(left), pivot, ...quickSort(right)];
  }
  
  const unsortedArray = [64, 34, 25, 12, 22, 11, 90];
  const sortedArray = quickSort(unsortedArray);
  console.log(sortedArray);
  