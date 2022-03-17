package com.company;

public class Worki {
    int a=8;
    int b=6;
    public static void main(String[] args){
        Worki w=new Worki();
        w.add(3,4);
    }
    public void add(int a,int b){
        this.a=5;
        int res=a+b;
        System.out.println(res);
        System.out.println(this.a);
    }
    public static double add(double a,double b){
        double res=a+b;
        return res;
    }
}
