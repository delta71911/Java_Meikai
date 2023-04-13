package Chapter_04;
import java.util.Random;
import java.util.Scanner;
public class Kazuate {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(100);

        System.out.println("숫자를 맞춰라 게임!");
        System.out.println("0 ~ 99의 수 중에서 맞춰보세요!!");

        int x;

        do {
            System.out.println("몇일까나?");
            x = stdIn.nextInt();

            if (x > no)
                System.out.println("더 작은수입니당");
            else if (x < no)
                System.out.println("더 큰수입니당");
        } while (x != no);
        System.out.println("정답입니당~~~");
    }
}
