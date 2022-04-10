function add(){
    let sum = 0;
    for(let i=0;i<arguments.length;i++){
        sum=sum+arguments[i];
    }
    return sum;
}
console.log(add(1,3,4,6,8));
console.log(add(2,6,9));

var x = (2 * 3) + 5;
	var y = 3 * 4;
	
	var result = myFunction(2,3);
	console.log(result);
	
	function myFunction(num1, num2) {
		var a = num1 * num2;
		var b = num1 + num2;
		return(a + b);
	}
	
	console.log( myFunction(3, 4));
	
	function toCelcius(f){
			return (5/9) * (f-32);
	}
	
	console.log("The temperature is "+ toCelcius(60));
