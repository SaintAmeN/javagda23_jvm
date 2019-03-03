package com.sda.javac;

import java.util.Scanner;

// javac src/com/sda/javac/Main.java
// java -cp src/ com.sda.javac.Main
// javap -verbose -private src/com/sda/javac/Main.class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc powtorzen:");
        int wartosc = scanner.nextInt();

        for (int i = 0; i < wartosc; i++) {
            System.out.println("Hello world!");
        }
    }
}
