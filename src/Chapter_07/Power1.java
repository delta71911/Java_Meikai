package Chapter_07;
import java.util.Scanner;
public class Power1 {
    static double power(double x, int n) {
        double tmp = 1.0;
        while (n-- > 0)
            tmp *= x;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a의 b승을 구합니다.");
        System.out.print("실수 a : ");    double a = stdIn.nextDouble();
        System.out.print("정수 b : ");    int b = stdIn.nextInt();

        System.out.println(a + "의 " + b + "승은 " + power(a, b) + "입니다.");
    }
}
