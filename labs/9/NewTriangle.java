import lab8.GeometricObject;

public class NewTriangle extends GeometricObject {
	//12.5
	private double side1 = 1;
	 private double side2 = 1;
	 private double side3 = 1;
	 
	 public NewTriangle(){ 
	 }
	 
	 public NewTriangle(double side1, double side2, double side3){
	  this.side1 = side1;
	  this.side2 = side2;
	  this.side3 = side3; 
	 }
	 //Display side1
	 public double getSide1() {
	  return side1;
	 }
	 
	 public void setSide1(double side1) {
	  this.side1 = side1;
	 }
	 //Display side2
	 public double getSide2() {
	  return side2;
	 }
	
	 public void setSide2(double side2) {
	  this.side2 = side2;
	 }
	 //Display side3
	 public double getSide3() {
	  return side3;
	 }
	 
	 public void setSide3(double side3) {
	  this.side3 = side3;
	 }
	 // Get Area
	 public double getArea(){
	  double s = (side1 + side2 + side3)/2;
	  return Math.sqrt(s * (s - side1)*(s - side2)* (s - side3));
	 }
	 //Get Perimeter
	 public double getPerimeter() {
	  return (side1 + side2 + side3);
	 }
	 //Display string
	 public String toString(){
	  return "triangle: side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3;
	 }
	}

