package Chapter_06;
import java.util.Scanner;
public class PointSumAveArray {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int sum = 0;
        final int NUMBER = 5;
        int[] points = new int[NUMBER];

        System.out.println(NUMBER + "명의 점수를 입력하세요.");
        for (int i = 0; i < NUMBER; i++) {
            System.out.printf((i + 1) + "번의 점수: ");
            points[i] = stdIn.nextInt();
            sum += points[i];
        }

        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + (double)sum / NUMBER + "점입니다.");
    }
}
