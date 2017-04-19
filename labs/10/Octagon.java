public class Octagon extends GeometricObject implements Cloneable {
	//13.11
    // all 8 sides equal length
    double side;


    public Octagon() {
        this(5);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return (2.0 + 4.0 / Math.sqrt(2) * side * side);
    }

    public double getPerimeter() {
        return side * 8;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return o;
    }

    public boolean equals(Object o) {
        return o instanceof Octagon && getArea() == ((Octagon)o).getArea();
    }
}
