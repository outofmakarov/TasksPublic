package betaTest;
// Напишите код, помещающий в переменную int c
// количество четных элементов c четными индексами
// ранее созданного массива a
public class exc12 {
    public static void main(String[] args){
        int a[];
        int c = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] % 2 == 0 && i % 2  == 0){
                c++;
            }
    }
}
