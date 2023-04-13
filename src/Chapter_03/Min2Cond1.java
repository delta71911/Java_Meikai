package Chapter_03;
import java.util.Scanner;
public class Min2Cond1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a");     int a = stdIn.nextInt();
        System.out.println("정수 b");     int b = stdIn.nextInt();

        int min = a < b ? a : b;
        System.out.println("작은 쪽은 " + min + "입니다.");
    }
}
