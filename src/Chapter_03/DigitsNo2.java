package Chapter_03;
import java.util.Scanner;
public class DigitsNo2 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if (n <= -10 || n >= 10)
            System.out.println("두자리 이상의 숫자입니다.");
        else
            System.out.println("두자리 미만의 숫자입니다.");

    }
}
