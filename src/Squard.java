
public class Squard {
    private double length;
    private double width;

    public Squard() {
        this.length = 5.2;
        this.width = 12.1;
    }

    public Squard(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double surface() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

}