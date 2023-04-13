package Chapter_03;
import java.util.Scanner;
public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a");     int a = stdIn.nextInt();
        System.out.println("정수 b");     int b = stdIn.nextInt();
        System.out.println("정수 c");     int c = stdIn.nextInt();

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        System.out.println("최대치는 " + max + "입니다.");
    }
}
