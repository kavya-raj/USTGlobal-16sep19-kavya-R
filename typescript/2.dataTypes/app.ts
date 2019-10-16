let myName : string = "shrusti";
console.log(myName, typeof myName);

let age : number;
console.log(age, typeof age);

let mobileNumber = 9876543676;
console.log(mobileNumber, mobileNumber);

let addrs;
addrs = "fghjkj";
addrs = 345678;
console.log(addrs, typeof addrs);

let calAge = function(): void{
    console.log('age is **');
}
calAge();

class Person {
    constructor(public name : string, public age : number){

    }
}
let person1 = new Person("shr", 20);
console.log(person1);

class Student extends Person{
    constructor(name : string, age : number, public rollnmbr : number){
        super(name, age);
    }
}
let student1 = new Student("pra", 22, 412);
console.log(student1);

