public class Main {
    public static void main(String[] args) {
        DrawFactory factory = new DrawFactory();

        Circle circle = new Circle();
        factory.printDraw(circle);
        Rectangle rectangle = new Rectangle();
        factory.printDraw(rectangle);
    }
}
