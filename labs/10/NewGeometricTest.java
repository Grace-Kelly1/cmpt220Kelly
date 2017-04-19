public class NewGeometricTest {
	public static void main(String[] args) {
		//13.5
		Circle2D c1 = new Circle2D(2, 2, 5.5);
	    Circle2D c2 = new Circle2D(5, 4, 9);
		
	    System.out.println("The circle that is larger is " + ((Circle2D)(NewGeometric.max(c1, c2))).getRadius() );
	    
	    MyRectangle2D r1 = new MyRectangle2D(2, 2);
	  	MyRectangle2D r2 = new MyRectangle2D(5, 4);
	  	
	  	System.out.println("The rectangle that is larger is " + ((MyRectangle2D)(NewGeometric.max(r1, r2))).getPerimiter() );

		}
	}
