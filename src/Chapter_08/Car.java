package Chapter_08;
class Car {
    private String name;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double fuel;

    Car(String name, int width, int height, int length, double fuel) {
        this.name = name;   this.width = width;     this.height = height;
        this.length = length;   this.fuel = fuel;
        x = y = 0.0;
    }

    double getX() { return x; }
    double getY() { return y; }
    double getFuel() { return fuel; }

    void putSpec() {
        System.out.println("모델명 : " + name);
        System.out.println("차폭 : " + width + "mm");
        System.out.println("차고 : " + height + "mm");
        System.out.println("전장 : " + length + "mm");
    }

    boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);
        if (dist > fuel)
            return false;
        else {
            fuel -= dist;
            x += dx;
            y += dy;
            return true;
        }
    }
}
