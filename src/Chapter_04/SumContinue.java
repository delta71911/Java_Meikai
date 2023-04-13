package Chapter_04;
import java.util.Scanner;
public class SumContinue {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 가산합니다.");
        System.out.print("몇개를 가산하시나요?");
        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("정수: ");
            int t = stdIn.nextInt();
            if (t < 0) {
                System.out.println("음의 정수는 포함이 안됩니다.");
                continue;
            }
            sum += t;
        }
        System.out.println("합계는 " + sum + "입니다.");
    }
}
