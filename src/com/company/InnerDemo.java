package com.company;

public class InnerDemo {
    public static void main(String[] args){
        Outer out=new Outer();
        out.show();

//        Inner in=new Inner();    //won't work
        Outer.Inner in = out.new Inner();   //references added. Non-static ref. Outer class object is used to as ref.
        in.display();

        Outer.StaticInner stin = new Outer.StaticInner();   //accessed in a static way. Means, using class reference
        stin.display();
    }
}

class Outer{
    void show(){
        System.out.println("Outer class");
    }
    class Inner{
        void display(){
            System.out.println("Inner class");
        }
    }
    static class StaticInner{     //use of static class
        void display(){
            System.out.println("Static Inner class");
        }
    }
}
