package com.company;

public class AbstractDemo2 {
    public static void main(String[] args){
        Kit k=new Kit();
        Writer p=new Pen();   // super class obj ref is created.
        Writer pc=new Pencil(); // super class obj ref is created. Based on the implementation class('Pencil' here), show(Object obj) method is executed.
        k.show(p); // calls 'write' method in 'Pen' class
        k.show(pc); // calls 'write' method from 'Pencil' class

        Writer p1=new Pen();
        //p1.checkPrint(); // this won;t work bcoz only the attributes extended from 'Writer' super class can be accessed since object ref is of type 'Writer'

        Pen p2=new Pen();
        p2.checkPrint();
        p2.write();
    }
}
abstract class Writer{
    abstract void write();
}
class Pen extends Writer{
    void write(){
        System.out.println("I'm a pen");
    }
    void checkPrint(){
        System.out.println("Check print");
    }
}
class Pencil extends Writer{
    void write(){
        System.out.println("I'm a pencil");
    }
}

class Kit{
    void show(Writer obj){  // Object is of type 'Writer' super class.so no need to create separate show() methods for pen and pencil
        obj.write();
    }
}