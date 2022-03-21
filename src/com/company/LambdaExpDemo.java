package com.company;

public class LambdaExpDemo {
    public static void main(String[] args){
        Aaa a=new Aaa() {
            @Override
            public void show() {
                System.out.println("Using Anonymous");
            }
        };
        a.show();

        Aaa b=() -> System.out.println("Using Lambda Expression"); // -> called lambda exp. It works since there's only one method in functional interface
        b.show();
    }
}
// Types of interfaces
// 1. normal 2.functional - with single abstract method 3.marker - without any methods

@FunctionalInterface
interface Aaa{
    void show();
}

/*
Abstract class - define and declare
 Interface - declare only - till 1.7
 1.8 can define methods in interface. But it should be default method, Ex: "default void show()" (have to mention 'default')

 vars created inside interface are constant by default(final)
*/

