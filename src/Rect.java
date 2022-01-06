public class Rect {
    double length;
    double width;

    public void Initialize(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeterRect() {
        return (2 * this.length + 2 * this.width);
    }

    public double squareRect() {
        return (this.length * this.width);
    }
}
