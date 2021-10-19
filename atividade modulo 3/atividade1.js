class Person {

    constructor(firstName, lastName, age, gender, interestes){
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
        this.gender = gender
        this.interestes = interestes
    }
    get name(){
        return `${this.firstName} ${this.lastName}`
    }

    bio(){
        return `${this.name()} is ${this.age} years old. They like ${this.interestes}`
    }

    greating(){
        return `Hi, I'm ${this.name()}`
    }
        
}

class Teacher extends Person{
    constructor (firstName, lastName, age, gender, interestes, subject){
        super(firstName, lastName, age, gender, interestes);
        this.subject = subject;
        this.type = "Teacher";
    }

    greating(){
        return `Hello. my name is ${this.lastName}, and I teach ${this.subject}`
    }


}

class Student extends Person{
    constructor (firstName, lastName, age, gender, interestes){
        super(firstName, lastName, age, gender, interestes);
        this.type = "Student";
    }

    greating(){
        return `Yo! I´m ${this.firstName}`
    }


}
