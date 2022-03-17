package com.company;

public class Main {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("$ ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int alphabet=64;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+alphabet)+" ");
            }
            System.out.println();
        }
    }
}


