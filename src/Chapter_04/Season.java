package Chapter_04;
import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int retry;

        do {
            System.out.println("지금이 몇 월인가요? 계절을 알려드릴게요.");
            int month = stdIn.nextInt();

            if (month >= 3 && month <= 5)
                System.out.println("봄이네요");
            else if (month >= 6 && month <= 8)
                System.out.println("여름이네요");
            else if (month >= 9 && month <= 11)
                System.out.println("가을이네요");
            else if (month == 12 || month == 1 || month == 2)
                System.out.println("겨울이네요");

            System.out.println("한번 더? 1 : 예, 0 : 아니오");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
