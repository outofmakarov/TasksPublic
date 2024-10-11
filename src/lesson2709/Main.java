package lesson2709;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int age = console.nextInt();

//        switch(age > 0 &&) {
//            case ():
//                System.out.println("ребёнок");
//                break;
//            case 2:
//                System.out.println("подросток");
//                break;
//            case 3:
//                System.out.println("взрослый");
//                break;
//            case 4:
//                System.out.println("пожилой");
//                break;
//            case 5:
//                System.out.println("мертвец");
//                break;
//        }

        if( age > 0 && age <= 11){
            System.out.println("ребёнок");
        }
        if( age >= 12 && age <= 17){
            System.out.println("подросток");
        }
        else if( age >= 18 && age <= 66){
            System.out.println("взрослый");
        }
        else if( age >= 67 && age <= 122){
            System.out.println("пожилой");
        }
        else if( age >= 123){
            System.out.println("мертвец");
        }



    }
}
