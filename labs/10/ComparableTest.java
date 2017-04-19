public class ComparableTest {
	public static void main(String[] args) {
		//13.9
		 	Circle c1 = new Circle(10);
	        Circle c2 = new Circle(10);
	        
	        MyRectangle2D r1 = new MyRectangle2D(2,5);
	        MyRectangle2D r2 = new MyRectangle2D(4,8);

	        System.out.println("c1 equals c2? " + c1.equals(c2));
	        System.out.println("r1 equals r2? " + r1.equals(r2));
	    }
	}

	