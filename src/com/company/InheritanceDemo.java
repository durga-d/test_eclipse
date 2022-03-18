package com.company;

public class InheritanceDemo {
    public static void main(String[] args){
        Calculator c=new Calculator();
        c.show(2,3);
        CalcAdv ca=new CalcAdv();
        ca.show(2,3);
        CalcAdvPro cap=new CalcAdvPro();
        cap.show(2,3);

//        CalcAdvPro cap1=new Calculator();   not possible
        Calculator cap1=new CalcAdvPro();
        cap.show(2,3);
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
}
class CalcAdvPro extends CalcAdv{
    int multi(int i,int j){
        return i*j;
    }
    void show(int i,int j){
        System.out.println("CalcAdvPro : "+add(i,j)+" "+sub(i,j)+" "+multi(i,j));
    }
}
