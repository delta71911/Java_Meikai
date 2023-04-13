package Chapter_03;
import java.util.Scanner;
public class Positive1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("입력한 숫자는 양의 정수입니다.");
    }
}
