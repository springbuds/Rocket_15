export {Group}

class Department {
    id: number
    name: string

    constructor(id: number, name: string){
        this.id = id
        this.name = name
    }
}

class Position {
    id: number
    name: string

    constructor(id: number, name: string){
        this.id = id
        this.name = name
    }
}

class Account {
    id: number
    name: string
    department: Department
    position: Position

    constructor(id: number, name: string, department: Department, position: Position){
        this.id = id
        this.name = name
        this.department = department
        this.position = position
    }
}

class Group{
    id: number
    name: string
    account: Account

    constructor(id: number, name: string, account: Account){
        this.id = id
        this.name = name
        this.account = account
    }
}

var dpm = new Department( 1, "A")
var pss = new Position( 1, "User")
var acc = new Account( 1, "Acc1", dpm, pss)
var grp = new Group(1, "Java", acc)
console.log(grp)
