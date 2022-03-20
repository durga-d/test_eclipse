package com.company;

public class WrapperDemo {
    public static void main(String[] args){
        int i=5; // primitive data type
        Integer ii=new Integer(i); // Boxing - Wrapping. This gives object reference
        int j=ii.intValue(); // unboxing - unwrapping
        System.out.println(j);
        // speedwise primitive data types are fast. Wrapper classes are used only in the frameworks where it's compulsory like hibernate,etc.

        Integer k=10; // autoboxing - autowrapping. Done without creating obj ref (new Integer(10))
        int g= k.intValue();  // autounboxing - autounwrapping

        String str="1234";
        int value=Integer.parseInt(str); // converts numerical string to integer
        System.out.println(value);

    }
}
