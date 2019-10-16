var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "shrusti";
console.log(myName, typeof myName);
var age;
console.log(age, typeof age);
var mobileNumber = 9876543676;
console.log(mobileNumber, mobileNumber);
var addrs;
addrs = "fghjkj";
addrs = 345678;
console.log(addrs, typeof addrs);
var calAge = function () {
    console.log('age is **');
};
calAge();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var person1 = new Person("shr", 20);
console.log(person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollnmbr) {
        var _this = _super.call(this, name, age) || this;
        _this.rollnmbr = rollnmbr;
        return _this;
    }
    return Student;
}(Person));
var student1 = new Student("pra", 22, 412);
console.log(student1);
