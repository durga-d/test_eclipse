package com.company;

public class InheritanceDemo {
    public static void main(String[] args){
        Calculator c=new Calculator();
        c.show(2,3);
        CalcAdv ca=new CalcAdv();
        ca.show(2,3);
        ca.display();
        CalcAdvPro cap=new CalcAdvPro();
        cap.show(2,3);

//        CalcAdvPro cap1=new Calculator();   not possible
        Calculator ca1=new CalcAdv();  //Calculator is just a ref here. But CalcAdvPro is the implementation
        ca1.show(2,3);
//        ca1.display(); //variable ca1 is of type Calculator which doesn't have access to display() method. But show() is an overridden method, so that alone can be accessed.
        Calculator cap1=new CalcAdvPro(); // bcoz CalcAdvPro holds an overridden method from Calculator. show()
        cap1.show(2,3);
    }
}
class Calculator{
    int add(int i,int j) {
        return i + j;
    }
    void show(int i,int j){
        System.out.println("Calculator : "+add(i,j));
    }
}
class CalcAdv extends Calculator{
    int sub(int i,int j){
        return i-j;
    }
    void show(int i,int j){
        System.out.println("CalcAdv : "+add(i,j)+" "+sub(i,j));
    }
    void display(){
        System.out.println("A display mesage");
    }
}
class CalcAdvPro extends CalcAdv{
    int multi(int i,int j){
        return i*j;
    }
    void show(int i,int j){
        System.out.println("CalcAdvPro : "+add(i,j)+" "+sub(i,j)+" "+multi(i,j));
    }
}
