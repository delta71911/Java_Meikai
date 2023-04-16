package Chapter_06;
import java.util.Scanner;
public class HighScore {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        final int NUMBER = 5;
        int[] tensu = new int[NUMBER];

        System.out.println(NUMBER + "명의 점수를 입력하세요");
        for (int i = 0; i < NUMBER; i++) {
            System.out.printf((i + 1) + "번의 점수");
            tensu[i] = stdIn.nextInt();
        }

        int max = tensu[0];
        for (int i = 1; i < tensu.length; i++)
            if (tensu[i] > max) max = tensu[i];

        System.out.println("최고점은 " + max + "점입니다.");
    }
}
