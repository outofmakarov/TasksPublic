package betaTest;
// апишите код, который выводит элементы целочисленного
// массива a, у которых оба индекса четные,
// разделяя их в строке пробелами.
//
//Считывать или создавать массив не нужно.
public class exc15 {
    public static void main(String[] args){
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < a.length; i += 2) {
            for (int j = 0; j < a[0].length; j += 2)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
