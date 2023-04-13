package Chapter_04;
import java.util.Scanner;
public class SumBreak1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 가산합니다.");
        System.out.println("몇 개를 가산하시나요?");
        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("0을 누르면 종료");
            int t = stdIn.nextInt();
            if (t == 0) break;
            sum += t;
        }
        System.out.println("합계는 " + sum + "입니다.");
    }
}
