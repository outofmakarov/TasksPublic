package Homework.oct02;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        float x = console.nextFloat();

        if (x >= -1000 && x <= 1000){
            if(x >= 3 && x <= 8){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("Input is wrong");
        }
    }
}
