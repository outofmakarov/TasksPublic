package Homework;

import java.util.Scanner;

public class dfghjk {
        public static String screenForm(int n){

            int hours = (n / 3600) % 24; // hours in a day
            int minutes = (n % 3600) / 60; // minutes
            int seconds = n % 60; // seconds

            return String.format("%d:%02d:%02d",hours, minutes, seconds);
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            System.out.println(screenForm(n));
        }
}
