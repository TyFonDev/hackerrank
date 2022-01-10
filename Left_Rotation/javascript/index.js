function rotateLeft(d, arr) {
  const returnArray = [...arr];

  for (let i = 0; i < d; i++) {
    const firstElement = returnArray.shift();
    returnArray.push(firstElement);
  }

  return returnArray;
}

const d1 = 4; 
const array1 = [1, 2, 3, 4, 5];

const d2 = 7; 
const array2 = [98, 67, 35, 1, 74, 79, 7, 26, 54, 63, 24, 17, 32, 81]

console.log(rotateLeft(d1, array1)); // expected 5 1 2 3 4
console.log(rotateLeft(d2, array2)); // expected 26 54 63 24 17 32 81 98 67 35 1 74 79 7