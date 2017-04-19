public abstract class NewGeometric implements Comparable<NewGeometric>  {
		// 13.5
		//Create variables
		private String color = "white";
		 private boolean filled;
		 private java.util.Date dateCreated;
		 
		 public NewGeometric() {
		  dateCreated = new java.util.Date();
		 }
		 public NewGeometric(String color , boolean filled) {
		  dateCreated = new java.util.Date();
		  this.color = color;
		  this.filled = filled;
		 }
		 public String getColor() {
		  return color;
		 }
		 public void setColor(String color) {
		  this.color = color;
		 }
		 public boolean isFilled() {
		  return filled;
		 }
		 public void setFilled(boolean filled){
		  this.filled = filled;
		 }
		 public java.util.Date getDateCreated(){
		  return dateCreated;
		 }
		 public String toString(){
		  return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
		 }
		 public static NewGeometric max(NewGeometric object1, NewGeometric object2) {
		  if(object1.compareTo(object2) < 0)
		   return object2;
		  else
		   return object1; 
		 }
		 
		}
