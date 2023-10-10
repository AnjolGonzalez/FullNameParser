package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name (first last or first middle last)");
        String name = scanner.nextLine();
        String[]parts = name.split(" ");

        System.out.println("First name: " + parts[0]);
        System.out.println("Middle name: " + parts[1]);
        System.out.println("Last name: " + parts[2]);
        

        }
}


