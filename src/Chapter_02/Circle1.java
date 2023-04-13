package Chapter_02;
import java.util.Scanner;
public class Circle1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("반경은? ");
        double r = stdIn.nextDouble();

        System.out.println("원의 둘레는 " + 2 * 3.14 * r + "입니다.");
        System.out.println("원의 넓이는 " + r * r *3.14 + "입니다.");
    }
}
