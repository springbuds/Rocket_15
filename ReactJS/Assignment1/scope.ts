var global: string = "This is global scope"

function local(){
    var local: string = "This is local scope"
    console.log("Lexical Scope : \'" + global +"\'")
    console.log(local);   
}
console.log(global);

local()