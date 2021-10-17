// //-------------------------1-------------------
// //--1.1--
// var date: number[] = [2020, 12, 8];
// var [year, month, day] = date;
// console.log(`Ngày ${day} Tháng ${month} Năm ${year}`);

// //--1.2--
// const person = {
//     firstName: "Nguyen",
//     lastName: "A",
//     age: 20
//     };
// const {firstName: f, lastName: l} = person
// console.log(f+" "+l);


// //-------------------------2-------------------
// //--2.1--
// let fullName2 = "Nguyễn Văn A"
// let age = 30
// let txt = `Tôi tên là ${fullName2}, năm nay ${age} tuổi, đang ế!`
// console.log(txt);

// //--2.2--
// let a = 5, b = 20
// let sum = `Tổng của ${a} và ${b} là ${a+b}`
// console.log(sum);

// //--2.3--
// let string = ["Chả giò nón lá", "Bò lúc lắc hạt điều", "Cá tai tượng chiên xù"]

// string.map(function(str, key){
//     var result = `
//         <div>
//             <ol>
//                 <li>${str}</li>
//             </ol>
//         </div>
//     `;
//     console.log(result);
// });


// //-------------------------3-------------------
// //--3.1--
// let arr1 = [2,4,6,8,10]
// let arr2 = [...arr1,5,7,9]
// //--3.2--
// let newArr = [...arr2]
// //--3.3--
// let cold = ['autumn', 'winter']
// let warm = ['spring', 'summer']
// let seasons = [...cold,...warm]


// //-------------------------4-------------------
// //--4.1--
// a => console.log(a + 100);

// //--4.2--
//     //--a--
//     (a, b) => console.log(a +b +100);
//     //--b--
//     let chuck = 42;
//     (a, b) => console.log(a +b +chuck);
//     //--c--
//     let bob = a => console.log(a +100);


// //-------------------------5-------------------
// //--5.1--
// function multiply (a: number, b= 1) {
//     console.log(a*b);
// }
// multiply(5)

// //--5.2--
// function multiply2(...x: number[]){
//     let sum = 1
//     x.forEach(element => {
//         sum *=element
//     });
//     console.log(sum);
// }
// multiply2(5,3,2)

// //--5.3--
// function printInformation(name: string, email?: string){
//     if(email != null){
//         console.log(`Tôi là ${name}. Email của tôi là ${email}`);
//     }else{
//         console.log(`Tôi là ${name}. Tôi chưa có Email`);
//     }
// }
// printInformation("Nam")
    

//-------------------------6-------------------
//--6.1--
var callAPI, callAPICreateGroup, callAPIAddUserToGroup, handleError
callAPI((a)=>{
    if(a){
      callAPICreateGroup((b)=>{
            if(b){
                callAPIAddUserToGroup((c)=>{
                    if(c) console.log('END');
                })
            }else console.log('END');
        })  
    }else console.log('END');
})


//-------------------------6-------------------
//--6.1--
callAPI()
.then(callAPICreateGroup)
.then(callAPIAddUserToGroup)
.then((result)=>{
    console.log('END');
})
.catch((error)=>{
    handleError(error);
})


//-------------------------7-------------------
//--7.1--
async function callAPI7() {
    if(true){

    }else console.log('END');
}
async function callAPICreateGroup7() {
    if(true){

    }else console.log('END');
}
async function callAPIAddUserToGroup7() {
    if(true){

    }else console.log('END');
}
