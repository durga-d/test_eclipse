package com.company;

public class SuperDemo {
    public static void main(String[] args){
        A a=new A(); System.out.println();

        B b=new B(); System.out.println();

        B b1=new B(2);   // output -> in A  in B - int -> it calls the super class default constr and then follows up with the sub class constr
        System.out.println();

        B b2=new B(2,3); System.out.println(); System.out.println();

        b.show();
    }
}
class A{
    int i=5;
    A(){
        System.out.print("in A  ");
    }
    A(int i){
        System.out.print("in A-int  ");
    }
    A(int i,int j){
        System.out.print("in A-int,int  ");
    }
    void show(){
        System.out.println("Show-A");
    }
}
class B extends A{   //class B inherits class A
    int i=10;
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
    @Override
    void show(){
        super.show(); // use of super in methods
        System.out.println("Show-B");
        System.out.println("Value of i : "+super.i); // use of super in variables
    }
}