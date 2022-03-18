package com.company;

public class SuperDemo {
    public static void main(String[] args){
        A a=new A();
        System.out.println();
        B b=new B();
        System.out.println();
        B b1=new B(2);   // output -> in A  in B - int -> it calls the super class default constr and then follows up with the sub class constr
        System.out.println();
        B b2=new B(2,3);
    }
}
class A{
    A(){
        System.out.print("in A  ");
    }
    A(int i){
        System.out.print("in A-int  ");
    }
    A(int i,int j){
        System.out.print("in A-int,int  ");
    }
}
class B extends A{   //class B inherits class A
    B(){
        super(); // even not added, super() is called implicitly as explained in the b1 obj ref.
        System.out.print("in B  ");
    }
    B(int i){
        System.out.print("in B-int  ");
    }
    B(int i,int j){
        super(5,6);  //to make it call another super class constr rather than the default one
        System.out.print("in B-int,int  ");
    }
}