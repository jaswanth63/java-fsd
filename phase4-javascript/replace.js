const message = "ball bat";

// replace the first b with c
let result = message.replace('b', 'c');
console.log(result);



const text1 = "Java is awesome. Java is fun."

// passing a string as the first parameter
let pattern = "Java";
let new_text = text1.replace(pattern, "JavaScript");
console.log(new_text);

// passing a regex as the first parameter
pattern = /Java/;
new_text = text.replace(pattern, "JavaScript");
console.log(new_text);



const text = "Java is awesome. Java is fun."

// notice the g switch in the regex pattern
const pattern1 = /Java/g;
const new_text1 = text.replace(pattern1, "JavaScript");
console.log(new_text1);



const text2 = "javaSCRIPT JavaScript"

// the first occurrence of javascript is replaced
let pattern2 = /javascript/i;  // case-insensitive search
let new_text2 = text2.replace(pattern2, "JS");
console.log(new_text2)  // JS JavaScript

// all occurrences of javascript is replaced
pattern = /javascript/gi;  // case-insensitive and global search
new_text = text.replace(pattern, "JS");
console.log(new_text)  // JS JS





const text4 = "Random digit: 3"

// generate a random digit between 0 and 9
function generateRandomDigit() {
  return Math.floor(Math.random() * 10)
}

// regex to match a digit
const pattern5= /\d/;

const new_text5 = text4.replace(pattern5, generateRandomDigit);
console.log(new_text5)
