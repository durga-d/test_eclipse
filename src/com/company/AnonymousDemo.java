package com.company;

public class AnonymousDemo {
    public static void main(String[] args){
        Ab a=new Ab();
        a.show(); // prints "in Ab show". But we want "I'm the best". So obj will be created for Cd.
        Ab c=new Cd(); c.show();
        // So the purpose of Cd is just to override the show() method. Instead of creating Cd, we can use Anonymous class like below.
        Ab b=new Ab(){
            void show(){
                System.out.println("I'm the best");
            }
        };
        b.show();
        // same thing applies for interface also. We know obj for interface cannot be created. but it's possible with this.
    }
}
class Ab{
    void show(){
        System.out.println("in Ab show");
    }
}
class Cd extends Ab{
    void show(){
        System.out.println("I'm the best");
    }
}