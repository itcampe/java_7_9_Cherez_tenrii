package it.campe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
        System.out.println(result);
    }
}
