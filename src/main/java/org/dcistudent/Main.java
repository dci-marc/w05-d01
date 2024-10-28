package org.dcistudent;

import lombok.NonNull;

public class Main {
    /**
     * Main method.
     * @param args Command line arguments.
     */
    static public void main(String[] args) {
        print();
        print("DCI");
        printReplace("DCI Student");
    }

    /**
     * Prints "Hello World!" to the console.
     */
    public static void print() {
        System.out.println("Hello World!");
    }

    /**
     * Prints "Good morning {message}!" to the console.
     * @param message The message to print.
     */
    public static void print(String message) {
        System.out.println("Good morning " + message + "!");
    }

    /**
     * Prints "Good morning {message}!" to the console, replacing spaces with underscores.
     * @param message The message to print.
     */
    public static void printReplace(@NonNull String message) {
        // I'll leave the optional out, since you should stick with the tools which already implement my cases.
        System.out.println("Good morning " + message.replaceAll(" ", "_") + "!");
    }
}
