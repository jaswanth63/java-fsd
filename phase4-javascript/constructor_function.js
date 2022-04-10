function person(){
    this.name="admin";
    this.age="20";
    this.greet=function(){
        console.log("hello");
    }
}
const person1=new person();
console.log(person1.name);
console.log(person1.age);
console.log(person1.greet());

function user(name,age){
    this.name=name;
    this.age=age;
}
const user1=new user('rahul',40);
console.log(user1.name);
user1.salary=30000;
console.log(user1.salary);
const user2 = new user();
console.log(user2.salary);
user.prototype.gender='male';
console.log(user1.gender);
console.log(user1.gender);