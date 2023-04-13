package Chapter_04;
import java.util.Scanner;
public class For2Var {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        for (int i = 1, j = n; i <= n; i++, j--)
            System.out.println(i + " " + j);
    }
}
