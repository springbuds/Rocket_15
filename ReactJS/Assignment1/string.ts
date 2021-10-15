import { Group } from "./datatype";

//--1--
var aString: string = "This is a string"
console.log("Chuỗi trên có : "+aString.length+" ký tự");

//--2--
var aString2: string = "string 2"
console.log(aString+' '+aString2);

//--3--
var Upper = (a: any) =>{
    if(typeof a !== 'string') return ''
    return a.charAt(0).toUpperCase() + a.slice(1)
}
console.log(Upper(aString2));

//--4--
var Upper = (a: any) =>{
    if(typeof a !== 'string') return ''
    for(let i =0; i <a.length; i++){
        console.log(a.charAt(i).toUpperCase());
    }
}
Upper("Nam")

//--5--
var firtName5 = "Nguyễn"
var lastName5 = "A"
console.log(firtName5+" "+lastName5);

//--6--
var fullName6 = "Nguyễn Văn Nam"
var array = fullName6.split(" ");
array.forEach(element => {
    console.log(element);
});

//--7--
var fullName7 = " nguyễn văn nam "
var split = fullName7.split(" ").filter(n=> n).join(" ")
console.log(split);

function upperCase (str: string) {
    var splitStr = str.toLowerCase().split(" ")
    for(let i= 0; i< splitStr.length; i++){
        splitStr[i] = splitStr[i].charAt(0).toUpperCase() + splitStr[i].substring(1); 
    }
    return splitStr.join(" ")
}
console.log(upperCase(split));

//--8--
for(let i = 0; i<Group.length; i++){
    if(Group.name === "Java"){
        console.log(Group.name);
    }
}


