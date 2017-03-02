public class RectangleTest {

	public static void main(String[] args) {
		// 9.1
		//Set up two rectangles
		Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(4,40);
        rectangles[1] = new Rectangle(3.5, 35.9);
        //Print rectangle info
        for (int i = 0; i < 2; i++){
            System.out.println("Rectangle " + (i+1) +":");
            System.out.print("Area = " + rectangles[i].getArea());
            System.out.println(" Perimeter = " +  rectangles[i].getPerimeter() +"\n");
        }
    }
}
