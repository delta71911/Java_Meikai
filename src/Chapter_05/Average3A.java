package Chapter_05;
import java.util.Scanner;
public class Average3A {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("x, y, z의 평균치를 구합니다.");
        System.out.printf("x의 값 : ");   int x = stdIn.nextInt();
        System.out.printf("y의 값 : ");   int y = stdIn.nextInt();
        System.out.printf("z의 값 : ");   int z = stdIn.nextInt();

        double ave = (x + y + z) / 3.0;
        System.out.printf("평균치는 %.3f입니다.\n", ave);
    }
}
