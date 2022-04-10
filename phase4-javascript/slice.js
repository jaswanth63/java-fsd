
let numbers = [2, 3, 5, 7, 11, 13, 17];

// create another array by slicing numbers from index 3 to 5
let newArray = numbers.slice(3, 6);
console.log(newArray);


let languages1= ["JavaScript", "Python", "C", "C++", "Java"];

// slicing the array (from start to end)
let new_arr = languages1.slice();
console.log(new_arr); // [ 'JavaScript', 'Python', 'C', 'C++', 'Java' ]

// slicing from the third element
let new_arr1 = languages1.slice(2);
console.log(new_arr1); // [ 'C', 'C++', 'Java' ]

// slicing from the second element to fourth element
let new_arr2 = languages1.slice(1, 4);
console.log(new_arr2); // [ 'Python', 'C', 'C++' ]




const languages = ["JavaScript", "Python", "C", "C++", "Java"];

// slicing the array from start to second-to-last
let new_arrr = languages.slice(0, -1);
console.log(new_arr); // [ 'JavaScript', 'Python', 'C', 'C++' ]

// slicing the array from third-to-last
let new_arrr1 = languages.slice(-3);
console.log(new_arr1);