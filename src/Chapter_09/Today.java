package Chapter_09;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
public class Today {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("오늘은 %4d %02d %02d일입니다.\n", today.get(YEAR), today.get(MONTH) + 1, today.get(DATE));
    }

}
