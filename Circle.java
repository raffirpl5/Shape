
public class Circle extends Shape{
    private int radius;

    public Circle() {
        super();
        radius = 0;
    }
    public Circle(String name, String color, int radius) {
        super();
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public void print() {
        System.out.println("Luas : " + getArea());
    }
}