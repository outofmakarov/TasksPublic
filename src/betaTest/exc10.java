package betaTest;

/*do {
        if (x % d == 0) break;
        d++;
        } while (d < x);*/

//task without break

public class exc10 {
    public static void main(String[] args){
        int x,d;
        do {
            if (x % d != 0) d++;
        } while (d < x && x % d != 0);
    }
}
