package Chapter_03;
import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("계절을 말씀드리겠습니다. 몇 월인가요?");
        int month = stdIn.nextInt();

        if (month >= 3 && month <= 5)
            System.out.println("봄입니다.");
        else if (month >= 6 && month <= 8)
            System.out.println("여름입니다.");
        else if (month >= 9 && month <= 11)
            System.out.println("가을입니다.");
        else if (month == 12 || month == 1 || month == 2)
            System.out.println("겨울입니다.");
    }
}
