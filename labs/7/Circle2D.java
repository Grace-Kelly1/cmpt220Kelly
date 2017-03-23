public class Circle2D {
	private double x; 
	private double y; 
	private double radius;

	//Default 
	Circle2D() {
		this(0, 0, 1);
	}

	//Create a Circle2D  
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	//Return x and y
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	//Return radius
	public double getRadius() {
		return radius;
	}

	//Return area
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	//Return perimeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	//True if inside circle 
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 < radius;
	}

	//True if inside circle 
	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= Math.abs(radius - circle.getRadius());
	}

	//True if overlaps with this circle 
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= radius + circle.getRadius();
	}

}