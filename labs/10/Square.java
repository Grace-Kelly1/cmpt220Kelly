class Square extends GeometricObject implements Colorable {
	//13.7
	    private double x;
	    private double y;
	    private double side;

	    Square() {
	        this(0,0,10);
	    }

	    Square(double x, double y, double side) {
	        this.x = x;
	        this.y = y;
	        this.side = side;
	    }

	    public double getArea() {
	        return side * side;
	    }

	    public double getPerimeter() {
	        return side * 4;
	    }

	    public String howToColor() {
	        return "Color all four sides.";
	    }

	    public double getX() {
	        return x;
	    }

	    public void setX(double x) {
	        this.x = x;
	    }

	    public double getY() {
	        return y;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }

	    public double getSide() {
	        return side;
	    }

	    public void setSide(double side) {
	        this.side = side;
	    }
	}

	