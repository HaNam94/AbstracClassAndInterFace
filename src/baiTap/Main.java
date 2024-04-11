package baiTap;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.6);
        Rectangle rectangle = new Rectangle(3.5, 5.0);
        Shape shape = new Shape("red", false);
        System.out.println("Trước thay đổi : ");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(shape);

        circle.resize(Math.random() * 100);
        rectangle.resize(Math.random() * 100);
//        shape.resize(Math.random() * 100);
        System.out.println("Sau thay đổi: ");
        System.out.println(circle);
        System.out.println(rectangle);
        circle.howToColor();
    }
}
