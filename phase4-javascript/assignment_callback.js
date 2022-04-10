function square(a,callback){
    console.log(4*a);
    callback(a,6);
}
function add(n1,n2,callback){
    console.log(n1+n2);
    callback(n2,6);
}

function multiply(n2,n3){
    console.log(n2*n3);
}
 square(4,add(4,6,multiply));