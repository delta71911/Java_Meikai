package Chapter_05;
import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("x, y의 평균치를 구합니다.");
        System.out.printf("x의 값");  int x = stdIn.nextInt();
        System.out.printf("y의 값");  int y = stdIn.nextInt();

        double ave = (double)(x + y) / 2;
        System.out.println("x와 y의 평균치는 " + ave + "입니다.");
    }
}
