var age=40;
console.log("age:"+age);
{
    age = 60;
    console.log("age inside block:"+age);//global variable
}
console.log("age after block:"+age);

let price =200;
console.log("price:"+price);
{
    let price =300;
    console.log("price inside block:"+price);//validate inside block only
}
console.log("price after block:"+price);

const marks=80;//constant variable
console.log("marks:"+ marks);
marks=60;
console.log("marks1:"+ marks);//error will occur