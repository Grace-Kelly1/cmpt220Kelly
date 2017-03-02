public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** return area **/
    public double getArea() {
        return this.width * this.height;
    }
    /** return perimeter **/
    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

}
