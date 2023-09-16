interface Animal{
    public void walk(); // default public , abstract for methods
    // varaiables are public , static, final by default
    // function can be implemented in the implemented class
    // cant implement any function;
    // cant have contructors;
}

interface Herbivore{

}

abstract class Animals{ // just exists , cant create any objects for this class
    abstract void walk();
    public void eat(){
        System.out.println("Animal can eat");
    }
}

class Dog implements Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Cow implements Animal,Herbivore{ // ** multiple class inheritance is possible only in interfaces
    public void walk(){
        //        super.walk();// if we want to call parent method then use super keyword
    }

}

class Horse extends Animals{ // cannot extend multiple classes (only possible in interface) **
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}


class Chicken extends Animals{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}


class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }

    public void writeColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    static String school;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }    

    Student(){
        System.out.println("Object was created");
    }

    // function overloading ( compile time polymorphism )
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name , int age){
        System.out.println(name + " " + age);
    }
}

class Shape{
    String color;
}

class Triangle extends Shape{

}

public class OOPS {
    public static void main(String[] args) {

    Pen pen1 = new Pen();
    pen1.color = "blue";
    pen1.type = "gel";

    Pen pen2 = new Pen();
    pen2.color = "red";
    pen2.type = "gel";

    pen1.writeColor();
    pen2.writeColor();

    Student.school = "BK Birla"; // declaring static variable (same for all objects)
    Student s1 = new Student();
    s1.name = "aman";
    s1.age = 18;

    s1.printInfo(s1.name);
    System.out.println(s1.school);

    Triangle t1 = new Triangle();
    t1.color = "blue";

    Horse horse = new Horse();
    horse.walk();
    horse.eat(); // can be called if extending abstract class
    }   
}
