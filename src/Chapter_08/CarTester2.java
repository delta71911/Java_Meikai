package Chapter_08;
import java.util.Scanner;
public class CarTester2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("자동차의 데이터를 입력하세요.");
        System.out.print("모델명은? ");     String name = stdIn.next();
        System.out.print("차폭은? ");       int width = stdIn.nextInt();
        System.out.print("차고는? ");       int height = stdIn.nextInt();
        System.out.print("전장은? ");       int length = stdIn.nextInt();
        System.out.print("가솔린 양은? ");   double fuel = stdIn.nextDouble();

        Car myCar = new Car(name, width, height, length, fuel);

        while (true) {
            System.out.println("현재위치(" + myCar.getX() + ", " + myCar.getY() + ") 남은 연료 " + myCar.getFuel());
            System.out.print("이동하시나요? 0 No 1 Yes");
            if (stdIn.nextInt() == 0) break;

            System.out.print("x방향의 이동거리 : ");
            double dx = stdIn.nextDouble();
            System.out.print("y방향의 이동거리 : ");
            double dy = stdIn.nextDouble();

            if (!myCar.move(dx, dy))
                System.out.println("연료가 모자랍니다.");
        }
    }
}
