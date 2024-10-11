package betaTest;

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double t1 = Double.parseDouble(numbers[0]);
        double t2 = Double.parseDouble(numbers[2]);
        double t3 = Double.parseDouble(numbers[4]);


        double result = t1 + t2 + t3;
        System.out.println(result);
    }
}
