function diagonalDifference(arr) {
  // Write your code here
  let leftToRigthDiagonalSum = 0;
  let rigthToLeftDiagonalSum = 0;

  for (let i = 0, j = arr.length - 1; i < arr.length; i += 1, j -= 1) {
    leftToRigthDiagonalSum += arr[i][i];
    rigthToLeftDiagonalSum += arr[i][j];
  }

  return Math.abs(leftToRigthDiagonalSum - rigthToLeftDiagonalSum);
}

// Algunos casos de prueba
const arr = [
  [11, 2, 4],
  [4, 5, 6],
  [10, 8, -12],
];
const arr2 = [
  [-1, 1, -7, -8],
  [-10, -8, -5, -2],
  [0, 9, 7, -1],
  [4, 4, -2, 1],
];

console.log(diagonalDifference(arr)); // expected 15
console.log(diagonalDifference(arr2)); // expected 1
