package Chapter_04;
import java.util.Scanner;
public class SumBreak2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 가산합니다.");
        System.out.println("몇 개를 가산하시나요?");
        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("정수");
            int t = stdIn.nextInt();
            if (sum + t > 1000) {
                System.out.println("합계가 1000을 넘었습니다.");
                System.out.println("마지막 수는 무시합니다.");
                break;
            }
            sum += t;
        }
        System.out.println("합계는 " + sum + "입니다.");
    }
}
