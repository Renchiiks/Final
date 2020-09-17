package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
        Class one = new Class("one");
        Class two = new Class("two");
        Class three = new Class("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        //one.instanceNumber = 4;

        System.out.println(Math.PI);

        //Math m = new Math();

        int pass = 2345;
        Password password = new Password(pass);
        Password extendedPassword = new ExtendedPassword(pass);
        password.storePassword();
        extendedPassword.storePassword();

        password.letMeIn(1);
        password.letMeIn(2345);
        password.letMeIn(3456);
        password.letMeIn(-334);

        System.out.println("Main method called");
        StaticInitializationBlock block = new StaticInitializationBlock();
        block.someMethod();
        System.out.println("Owner is " + StaticInitializationBlock.owner);

    }
}
