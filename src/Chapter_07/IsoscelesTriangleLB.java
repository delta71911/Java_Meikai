package Chapter_07;
import java.util.Scanner;
public class IsoscelesTriangleLB {
    static void putStars(int n) {
        while (n-- > 0)
            System.out.print('*');
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("왼쪽으로 수직인직각이등변 삼각형을 표시합니다.");
        System.out.print("단수는? ");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++)
            putStars(i);
        System.out.println();
    }
}
