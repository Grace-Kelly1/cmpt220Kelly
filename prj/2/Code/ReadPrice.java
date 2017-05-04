import java.io.*;
import java.io.File;
import java.util.Scanner;

public class ReadPrice {
		//Data Fields
		private String Ticker;
		private int NumberShares;
		
		public ReadPrice(String Ticker){
			this.Ticker = Ticker;
		}
		
		//Get price for individual ticker
		public double getPrice(String Ticker) throws IOException{
			double priceMaybe = 0;
			// Create a Scanner for the file
		    Scanner input = new Scanner(new File("C:\\data\\Price.txt"));
		    
		    // Read data from a file
			while (input.hasNext()) {
			      String Stock = input.next();
			      priceMaybe = input.nextDouble();
			      
			      //Check for match 
			      if (Stock.equals(Ticker)){
			    	 break;
			      }
			}
			
			// Close the file
		    input.close();
		    
		    //Return Price Value
		    return priceMaybe;
		}
	
}