package Chapter_07;
import java.util.Scanner;
public class Sum {
    static int sum (int a, int b, int... no) {
        int s = a + b;
        for (int i = 0; i < no.length; i++)
            s += no[i];
        return s;
    }

    public static void main(String... args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("sum(1, 2)          = " + sum(1, 2));
        System.out.println("sum(1, 2, 3)       = " + sum (1, 2, 3));
        System.out.println("sum(1, 2, 3, 4, 5  = " + sum (1, 2, 3, 4, 5));

        System.out.print("배열x의 요소수는 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }
        System.out.println("sum(1, 3, x) = " + sum(1, 3, x));
    }
}
