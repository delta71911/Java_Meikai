package Chapter_06;
import java.util.Arrays;
import java.util.Scanner;
public class IntArrayScan {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("요소치");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }
        System.out.println("a = " + Arrays.toString(a));
    }
}
