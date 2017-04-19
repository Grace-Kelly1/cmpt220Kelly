public class MyRectangle2D extends NewGeometric {
	//13.5
	 double width = 1;
	   double height = 1;
	  
	  public MyRectangle2D() {
	  }
	  public MyRectangle2D(double width, double height){
	   this.width = width;
	   this.height = height;
	  }
	  public double getArea() {
	   return width * height ;
	   
	  }
	  public double getPerimiter() {
	   return 2 * (width + height);
	  }
	  
	  public int compareTo(NewGeometric o) {
	   if (getPerimiter() < ((MyRectangle2D)o).getPerimiter())
	    
	    return -1;
	   else if (getPerimiter() == ((MyRectangle2D)o).getPerimiter())
	    return 0;
	   else
	    return 1;
	  }
	 }
