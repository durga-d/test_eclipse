package com.company;

public class AbstractDemo {
    public static void main(String[] args){
        //Human hu=new Human(); // abstract class cannot be instantiated
        Man m=new Man();
        m.walk();
        m.eat();

        Printer.printThis(5.5f);  // this method will print all number format values(Integer, Float, Double..). Bcoz 'Number' is the super class
// of Integer, Float, Double... Do check those classes. Giving super class ref here(Number). Use of Abstract class.
    }
}

abstract class Human{   // when holding an abstract method, class must be abstract.
    public void eat() {
        System.out.println("I can eat");
    }
    public abstract void walk(); // method without definition must be made abstract, else error.
}
class Man extends Human{  // use 'extends' keyword

    @Override    // must implement the abstract method defined in the extended abstract super class, else error.
    public void walk() {
        System.out.println("I can walk");
    }
    // eat() method needs not be implemented since it's not abstract
}

class Printer{
     static void printThis(Number i){
        System.out.println(i);
    }
}