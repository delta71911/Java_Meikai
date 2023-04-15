package Chapter_05;
import java.util.Scanner;
public class FloatDouble2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("변수x는 float형이고 변수y는 double형입니다.");
        System.out.printf("x: ");   float x = stdIn.nextFloat();
        System.out.printf("y: ");   double y = stdIn.nextDouble();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }


}
