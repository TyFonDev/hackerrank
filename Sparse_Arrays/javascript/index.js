function matchingStrings(strings, queries) {
  // Write your code here
  const matching = [];
  for (let i = 0; i < queries.length; i++) {
    let count = 0;
    for (let j = 0; j < strings.length; j++) {
      if (queries[i] === strings[j]) {
        count += 1;
      }
    }
    matching.push(count);
  }

  return matching;
}

const strings1 = ["aba", "baba", "aba", "xzxb"],
  strings2 = ["def", "de", "fgh"];
const queries1 = ["aba", "xzxb", "ab"],
  queries2 = ["de", "lmn", "fgh"];

console.log(matchingStrings(strings1, queries1)); // expected 2 1 0
console.log(matchingStrings(strings2, queries2)); // expected 1 0 1
