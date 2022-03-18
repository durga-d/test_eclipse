package com.company;

public class VarArgs {
    public static void main(String[] args){
        Calc c=new Calc();
        c.add(2,3);
        c.addAnyNoOfArgs(2,3,4,5,6,7,87);
    }
}
class Calc{
    int add(int i,int j){  // we cannot pass more than 2 args here.
        return i+j;
    }
    int addAnyNoOfArgs(int ... n){  //3 dots are used to convey it as an array. So any no.of arguments can be passed.This is called Variable Arguments
        int sum=0;
        for(int i:n){
            sum+=i;
        }
        return sum;
    }
}