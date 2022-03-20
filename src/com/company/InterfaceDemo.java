package com.company;

public class InterfaceDemo {
    public static void main(String[] args){
        Abc a=new Def(); // only Interface obj ref can be created, but object cannot be created.
        // Abc ab=new Abc()  // is not possible. Reason mentioned above.
        a.show();
    }
}

interface Abc{
    void show(); // methods are 'public abstract' by default
    // No methods with definition can be added. So interface is used only when method declarations alone are needed. But in abstract classes it's possible.
}
class Def implements Abc{  // keyword 'implements'

    @Override
    public void show() {  // as like abstract classes, methods in implemented interface class should be overridden.
        System.out.println("Interface Demo");
    }
}