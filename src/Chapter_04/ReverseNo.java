package Chapter_04;
import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("수열을 반대로 표시합니다.");
        int x;
        do {
            System.out.println("정수치");
            x = stdIn.nextInt();
        } while (x <= 0);

        System.out.println("반대로 나열하면");
        while (x > 0) {
            System.out.println(x % 10);
            x /= 10;
        }
        System.out.println("입니다.");
    }
}
