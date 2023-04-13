package Chapter_03;
import java.util.Scanner;
public class Equal {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("졍수 a");     int a = stdIn.nextInt();
        System.out.println("정수 b");     int b = stdIn.nextInt();

        if (a == b)
            System.out.println("두 수는 같습니다.");
        else
            System.out.println("두 수는 같지않습니다.");
    }
}
