package Chapter_03;
import java.util.Scanner;
public class DigitsNo1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if (n == 0)
            System.out.println("그 수는 0입니다.");
        else if (n >= -9 && n <= 9)
            System.out.println("1이 자리 숫자입니다.");
        else
            System.out.println("2의 자리 숫자 이상의 수입니다.");
    }
}
