package main.java;

public class Main {
    public static void main(String[] args) {

        int limit = 100;

        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Visual Nuts");
            } else if (i % 3 == 0) {
                System.out.println("Visual");
            } else if (i % 5 == 0) {
                System.out.println("Nuts");
            } else {
                System.out.println(i);
            }
        }
    }
}