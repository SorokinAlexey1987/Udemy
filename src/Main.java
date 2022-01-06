public class Main {
    public static void main(String[] args) {
        Rect rect1 = new Rect();
        rect1.Initialize(4.5, 7.5);
        System.out.println(rect1.perimeterRect());
        System.out.println(rect1.squareRect());
        Rect rect2 = new Rect();
        rect2.Initialize(3, 2.5);
        System.out.println(rect2.squareRect());
    }
}
