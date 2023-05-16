package Chapter_09;

public class DayArrayInit {
    public static void main(String[] args) {
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};

        Day[] x = {
                    new Day(1868, 8, 8),
                    new Day(1912, 7, 30),
                    new Day(1926, 12, 25),
                    new Day(1989, 1, 8),
                    new Day(2019, 5, 1)
        };

        for (int i = 0; i < x.length; i++)
            System.out.printf("x[%d] = %04d년 %02d월 %02d일(%s)\n", i, x[i].getYear(), x[i].getMonth(), x[i].getDate(), wd[x[i].dayOfWeek()]);
    }
}
