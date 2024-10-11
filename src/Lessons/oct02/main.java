package Lessons.oct02;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while( isExit != true){
            int firstDigit = console.nextInt();
            String mathOper = console.next();
            int secondDigit = console.nextInt();

            switch(mathOper){
                case "exit":
                    isExit = true;
                    break;
                case "+":
                    System.out.println(plus(firstDigit, secondDigit));
                    break;
                case "-":
                    System.out.println(minus(firstDigit, secondDigit));
                    break;
                case "*":
                    System.out.println(mult(firstDigit, secondDigit));
                    break;
                case "/":
                    System.out.println(div(firstDigit, secondDigit));
                    break;
                case "%":
                    System.out.println(divWithRema(firstDigit, secondDigit));
                    break;
                case "^":
                    System.out.println(mathPow(firstDigit, secondDigit));
                    break;

            }
        }
    }
    public static int plus(int a, int b){
        return a + b;
    }
    public static int minus(int a, int b){
        return a - b;
    }
    public static int mult(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        return a / b;
    }
    public static int divWithRema(int a, int b){
        return a % b;
    }
    public static double mathPow(double a, double b){
        return Math.pow(a, b);
    }


}
