Department= {
    DepartmentID: [1,2,3],
    DepartmentName: ["NameD1","NameD2","NameD3"]
};

Position= {
    PositionID: [1,2,3],
    PositionName:["NameP1","NameP2","NameP3"]
}

Account= {
    AccountID: [1,2,3],
    Email: ["acc1@gmail.com","acc2@gmail.com","acc3@gmail.com"],
    Username: ["acc1","acc2","acc3"],
    DepartmentID: Department.DepartmentID,
    FullName: ["Nguyễn Văn A","Nguyễn Văn B","Nguyễn Văn C"],
    PositionID: ["DEV","JAVA","DEV"]
}

Group= {
    GroupID: [1,2,3],
    GroupName: ["Gr1","Gr2","Gr3"],
    CreatorID: [1,2,3],
    CreateDate: new Date()
}

GroupAccount= {
    GroupID: Group.GroupID,
    AccountID: Account.AccountID,
    JoinDate: new Date()
}

console.log(GroupAccount);
console.log(Department);
console.log(Position);
console.log(Account);
console.log(Group);

//Kiểm tra phòng ban của acc2
if(Account.DepartmentID==null){
    console.log("Nhân viên này chưa có phòng ban");
}else{
    console.log("Phòng ban của nhân viên này là " + Account.DepartmentID[2-1]);
}

//Kiểm tra group của acc2
if(GroupAccount.AccountID[1]==null){
    console.log("Nhân viên này chưa có group");
}else if(GroupAccount.AccountID[1]== 1 || GroupAccount.AccountID[1]== 2){
    console.log("Group của nhân viên này là Java Fresher, C# Fresher");
}else if(GroupAccount.AccountID[1]==3){
    console.log("Nhân viên này là người quan trọng, tham gia nhiều group");
}else if(GroupAccount.AccountID[1] > 3){
    console.log("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
}

//Toán tử 3 ngôi
Account.DepartmentID==null ? console.log("Nhân viên này chưa có phòng ban") : console.log("Phòng ban của nhân viên này là " + Account.DepartmentID[2-1]);

//String
let myString= "Đây là một string để đếm";
console.log("Độ dài chuỗi: "+myString.length);
let myString2= "Đây là String cộng thêm vào";
console.log( myString +" "+myString2);

