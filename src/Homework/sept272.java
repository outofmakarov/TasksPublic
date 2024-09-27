package Homework;

import java.util.Scanner;

public class sept272 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
//        int nextEven = n + (n % 2) + 1;
        int hundreds = number / 100;    // Get the hundreds digit
        int tens = (number / 10) % 10; // Get the tens digit
        int units = number % 10;      // Get the units digit

        int sum = hundreds + tens + units;

        System.out.println(sum);
    }
}

