package com.company;

public class StaticDemo {
    static{
        System.out.println("Main static block");
    }
    public static void main(String[] args){
        Demo d=new Demo();
        Demo d1=new Demo();
        d.show();
        d1.show();
    }
}
class Demo{
    int i;
    int j;
    static String str;
    static{ //executed when class is loaded. so that printed only once(check output)
        str="happy";
        System.out.println("In static block");
    }
    Demo(){  //executed when object is created
        i=5;
        j=6;
        System.out.println("In constructor");
    }
    static{ //executed when class is loaded. so that printed only once(check output)
        str="happyhappy";
        System.out.println("In static block - 2");
    }
    void show(){
        System.out.println(i+" : "+j+" : "+str);
    }
}