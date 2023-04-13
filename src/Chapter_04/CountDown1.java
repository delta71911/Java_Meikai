package Chapter_04;
import java.util.Scanner;
public class CountDown1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("카운트다운을 합니다.");
        int x;

        do {
            System.out.println("정수");
            x = stdIn.nextInt();
        } while (x <= 0);

        while (x >= 0) {
            System.out.println(x);
            x--;
        }
    }
}
