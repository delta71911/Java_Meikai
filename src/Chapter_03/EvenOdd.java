package Chapter_03;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if (n <= 0)
            System.out.println("양의 정수가 아닌 수가 입력되었습니다.");
        else
            if (n % 2 == 0)
                System.out.println("그 수는 짝수입니다.");
            else
                System.out.println("그 수는 홀수입니다.");
    }
}
