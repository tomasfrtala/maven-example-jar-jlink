package com.test.example.jar;

public class Main {

    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println("Main from Java " + version + " (jar)");

        if (args.length > 0) {
            System.out.println("Received these arguments:");

            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
