package betaTest;

// Например, если элементы нумеруются, начиная с нуля,
// то 0-й элемент становится 1-м, 1-й становится 2-м,
// ..., последний становится 0-м,
// то есть массив {3, 5, 7, 9} превращается в массив
// {9, 3, 5, 7}.
public class exc16 {
    public static void main(String[] args){

    }
    public static void rotRight(int[] arr) {
        int n = arr.length;
        int t = arr[n-1];
        for(int i = n-1; i > 0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = t;
    }
}
