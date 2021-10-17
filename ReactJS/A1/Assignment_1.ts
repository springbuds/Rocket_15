//--2.1--
var acc1: number = 5240.5
var acc2: number = 10970.055

acc1 = Math.round(acc1)
acc2 = Math.round(acc2)
console.log(acc1);
console.log(acc2);

//--2.2--
var rd = Math.floor(Math.random()*90000)+10000
console.log(rd);

//--2.3--
var str = String(rd)
console.log(str.slice(-2));

//--3.1--
var arr = ['a', 'b', 'c', 'd', 'e']
for (const key in arr) {
    if (Object.prototype.hasOwnProperty.call(arr, key)) {
        const element = arr[key];
        console.log(element);
    }
}console.log('------------------');

var arrForOf = arr.entries()
for (const iterator of arrForOf) {
    console.log(iterator);
}

// --4.1--
// --4.2--
// Đã làm ở scope.ts

//--4.3--
function getGreeting(firstName: string, lastName: string){
    var greeting = function() {
        return firstName +" "+lastName
    }
    return greeting
}

var greetingFullName = getGreeting("Nguyễn Văn", "A")
console.log(greetingFullName());

//--4.4--
var time = function(i: number) {
    setTimeout(function time(){
        console.log(i); 
    }, i*1000)
}

for(let i = 1; i <= 6; i++){
    time(i)
}

