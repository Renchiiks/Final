package com.example.mypackage;

public class StaticInitializationBlock {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SINTest static initialization block called");
    }

    public StaticInitializationBlock() {
        System.out.println("SIB constructor");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
