package com.example.mypackage;

public class Password {
    private static final int key = 765432;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptPassword(password);
    }

    private int encryptPassword(int password) {
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);

    }

    public boolean letMeIn(int password) {
        if (encryptPassword(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot go in");
            return false;
        }
    }
}
