package Chapter_07;
import java.util.Scanner;
public class LinearSearch {
    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소수");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }
        System.out.print("찾고있는 숫자");
        int ky = stdIn.nextInt();

        int idx = linearSearch(x, ky);

        if (idx == -1)
            System.out.println("그 수는 존재하지 않습니다.");
        else
            System.out.println("그 수는 x[" + idx + "]에 존재합니다." );

    }
}
