public class GeometricObject {
	// 13.1
	//Create variables
		 private String color = "white";
		 private boolean filled;
		 private java.util.Date dateCreated;
		 
		 public GeometricObject() {
		  dateCreated = new java.util.Date();
		 }
		 public GeometricObject(String color , boolean filled) {
		  dateCreated = new java.util.Date();
		  this.color = color;
		  this.filled = filled;
		 }
		 //Get color of shape
		 public String getColor() {
		  return color;
		 }
		 public void setColor(String color) {
		  this.color = color;
		 }
		 //Shape is filled or not
		 public boolean isFilled() {
		  return filled;
		 }
		 public void setFilled(boolean filled){
		  this.filled = filled;
		 }
		 //Date
		 public java.util.Date getDateCreated(){
		  return dateCreated;
		 }
		 //Display
		 public String toString(){
		  return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
		 }
	}