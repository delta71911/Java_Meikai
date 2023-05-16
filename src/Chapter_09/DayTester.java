package Chapter_09;
import java.util.Scanner;
public class DayTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        System.out.println("생일을 서기력으로 입력하세요.");
        System.out.print("년 : ");   int y = stdIn.nextInt();
        System.out.print("월 : ");   int m = stdIn.nextInt();
        System.out.print("일 : ");   int d = stdIn.nextInt();

        Day birthday = new Day(y, m, d);
        System.out.println("당신의 생일은 " + birthday.getYear() + "년" + birthday.getMonth() + "월" + birthday.getDate() + "일" + wd[birthday.dayOfWeek()] + "요일입니다.");
    }
}
