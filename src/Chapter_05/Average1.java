package Chapter_05;
import java.util.Scanner;
public class Average1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치 x");    int x = stdIn.nextInt();
        System.out.println("정수치 y");    int y = stdIn.nextInt();

        double ave = (x + y) / 2;
        System.out.println("x와 y의 평균치는 " + ave + "입니다.");
    }
}
