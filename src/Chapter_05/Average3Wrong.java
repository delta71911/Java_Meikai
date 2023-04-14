package Chapter_05;
import java.util.Scanner;
public class Average3Wrong {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치 x, y, z의 평균치를 구합니다.");
        System.out.print("x의 값 : ");    int x = stdIn.nextInt();
        System.out.print("y의 값 : ");    int y = stdIn.nextInt();
        System.out.print("z의 값 : ");    int z = stdIn.nextInt();

        double ave = (x + y + z) / 3;
        System.out.printf("x, y, z의 평균치는 %.3f입니다.\n", ave);
    }
}
