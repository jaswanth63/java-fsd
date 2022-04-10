function student(Student_name,Student_age,student_gender){
    this.Student_name=Student_name;
    this.Student_age=Student_age;
    this.student_gender=student_gender;
}
const student1=new student('pankaj',23,'male');
const student2=new student('reena',25,'female');
const student3=new student('rajeev',26,'male');
console.log(student1.Student_name);
console.log(student1.Student_age);
console.log(student1.student_gender);
console.log(student2.Student_name);
console.log(student2.Student_age);
console.log(student2.student_gender);
console.log(student3.Student_name);
console.log(student3.Student_age);
console.log(student3.student_gender);
student.prototype.branch='cse';
student.prototype.college='abc';
console.log(student1.branch);
console.log(student1.college);
console.log(student2.branch);
console.log(student2.college);
console.log(student3.branch);
console.log(student3.college);

student.prototype ={branch:'IT'};
const student4=new student();
console.log(student4.branch);
console.log(student1.branch);
