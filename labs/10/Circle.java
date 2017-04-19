
	public class Circle extends GeometricObject implements Comparable {
		//13.11
	    private double radius;

	    //Default constructor
	    public Circle() {
	        this(1.0);
	    }

	    //Construct circle with a specified radius
	    public Circle(double radius) {
	        this(radius, "white", false);
	    }

	    //Construct a circle with specified radius, filled, and color
	    public Circle(double radius, String color, boolean filled) {
	        super(color, filled);
	        this.radius = radius;
	    }

	    //Return radius
	    public double getRadius() {
	        return radius;
	    }

	    //new radius
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    //Implement the getArea 
	    public double getArea() {
	        return radius*radius*Math.PI;
	    }

	    //Implement the getPerimeter 
	    public double getPerimeter() {
	        return 2*radius*Math.PI;
	    }

	    //Override 
	    public boolean equals(Circle circle) {
	        return this.radius == circle.getRadius();
	    }

	    public String toString() {
	        return "[Circle] radius = " + radius;
	    }
	}


