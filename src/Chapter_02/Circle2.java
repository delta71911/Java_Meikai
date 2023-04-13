package Chapter_02;
import java.util.Scanner;
public class Circle2 {
    public static void main(String[] args) {
        final double PI = 3.1416;
        Scanner stdIn = new Scanner(System.in);

        System.out.println("반경은? ");
        double r = stdIn.nextDouble();

        System.out.println("원의 둘레는 " + 2 * PI * r);
        System.out.println("원의 면적은 " + PI * r * r);
    }
}
