package Chapter_06;
import java.util.Scanner;
public class PointSumAve {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int sum = 0;
        System.out.println("5명의 점수를 입력하세요");

        System.out.printf("1번 학생 점수 : ");
        int tanaka = stdIn.nextInt();
        sum += tanaka;

        System.out.printf("2번 학생 점수 : ");
        int takeda = stdIn.nextInt();
        sum += takeda;

        System.out.printf("3번 학생 점수 : ");
        int koga = stdIn.nextInt();
        sum += koga;

        System.out.printf("4번 학생 점수 : ");
        int tozuka = stdIn.nextInt();
        sum += tozuka;

        System.out.printf("5번 학생 점수 : ");
        int nakamura = stdIn.nextInt();
        sum += nakamura;

        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + (double)sum / 5 + "점 입니다.");
    }
}
