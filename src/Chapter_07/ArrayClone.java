package Chapter_07;
import java.util.Scanner;
public class ArrayClone {
    static int[] cloneOf(int[] a) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i];
        return c;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        int[] y = cloneOf(x);

        System.out.println("배열 x의 복제 y를 만들었습니다.");
        for (int i = 0; i < num; i++)
            System.out.println("y[" + i + "] = " + y[i]);
    }
}
