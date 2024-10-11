package betaTest;
/*В коде объявлены целочисленные переменные x и c. И дальше следует такой фрагмент:

int c = 0;
int x = scanner.nextInt();
do {
    c++;
    x++;
} while (x < 100);
Тимлид не любит do-while, поэтому он быстро переписал код так:

int c = 0;
int x = scanner.nextInt();
while (x < 100) {
    c++;
    x++;
}
    */


import java.util.Scanner;

public class exc8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int c = 0;
        int x = scanner.nextInt();
        while (x < 100) {
            c++;
            x++;
        }
        if (x - c >= 100) {
            x++;
            c++;
        }
        System.out.println(x + " " + c);
    }
}

