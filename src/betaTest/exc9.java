package betaTest;

import java.util.Scanner;

public class exc9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int c = scanner.nextInt();
        /*while (c < 50){
            if (x >= 500) break;
            c++;
            x += c*2; /* x = x + c*2 */
        for (c = c, x = x; c<50 && x <= 500; x += c*2){
        }
    }
}
