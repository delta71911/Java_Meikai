package Chapter_09;
import java.util.Scanner;
public class DayTester2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("day1을 입력하세요.");
        System.out.print("년 : ");   int y = stdIn.nextInt();
        System.out.print("월 : ");   int m = stdIn.nextInt();
        System.out.print("일 : ");   int d = stdIn.nextInt();
        Day day1 = new Day(y, m, d);

        System.out.println("day2를 입력하세요.");
        System.out.print("년 : ");    y = stdIn.nextInt();
        System.out.print("월 : ");    m = stdIn.nextInt();
        System.out.print("일 : ");    d = stdIn.nextInt();
        Day day2 = new Day(y, m, d);

        if (day1 == day2)
            System.out.println("같은 날입니다.");
        else
            System.out.println("같은 날이 아닙니다.");

        Day day3 = day1;
        day3.set(2999, 12, 31);
        System.out.printf("day1 = %d년 %d월 %d일\n", day1.getYear(), day1.getMonth(), day1.getDate());
        System.out.printf("day3 = %d년 %d월 %d일\n", day3.getYear(), day3.getMonth(), day3.getDate());
    }
}
