import java.util.Scanner; 
import java.io.*;

public class ReadData {
  public static void main(String[] args) throws IOException { 
	
	//Display Instructions
	System.out.println("This is a Stock Market application coded in Java.");
	System.out.println("Please make sure your Stock Market Portfolio is saved under the C Drive in a folder named 'data'.");
	System.out.println("The text file should be named StockMarketSheet.txt");
	System.out.println("(Keep in mind this application currently only works on Windows)");
	System.out.println("Enter 1 to run application");
	
	//Run or not Run
	Scanner input1 = new Scanner(System.in);
	int run = input1.nextInt();
	
	if(run == 1){
    // Create a Scanner for the file
    Scanner input = new Scanner(new File("C:\\data\\StockMarketSheet.txt"));
    
    double totalPortValue = 0;
    
    // Read data from a file
    while (input.hasNext()) {
      String StockSymbol = input.next();
      double NumberShares = input.nextDouble();
      
      //Use Methods
      ReadPrice IndividualStock = new ReadPrice(StockSymbol);
      double price = IndividualStock.getPrice(StockSymbol);
      
      //Individual value calculated
      double value = price * NumberShares;
      
      //Display
      System.out.println("Ticker: " + StockSymbol + ", " + NumberShares + " Shares, $" + price + ", Total: $" + value);
      
      //Total Portfolio Value
      totalPortValue += value;
    }

    // Close the file
    input.close();
    
    //Display total portfolio value for user
    System.out.println("Total Portfolio Value: $" + totalPortValue);
    
    //Read previous saved value from output file
    Scanner input2 = new Scanner(new File("C:\\data\\outputfile.txt"));
    double oldTotal = input2.nextDouble();
    input2.close();
	
	
	//Ask user if they want to save information
	System.out.println("Enter 2 to save the total portfolio value into a file");
	int save = input1.nextInt();
	
	if(save == 2){
		PrintWriter writer = new PrintWriter(new FileWriter("C:\\data\\outputfile.txt"));
		writer.print(totalPortValue);
		writer.close();
	}
	
	//Ask user if they would like to compare
	System.out.println("Enter 3 if you would like to compare your total value from your previous check");
	System.out.println("Or enter 0 to end the program");
	int compare = input1.nextInt();
	
	if(compare == 3){
		System.out.println("Previous: $" + oldTotal);
		System.out.println("Current: $" + totalPortValue);
		
		double maxValue = Math.max(oldTotal, totalPortValue);
		if(maxValue == oldTotal){
			double difference1 = oldTotal - totalPortValue;
			System.out.println("You have lost $" + difference1);
		}
		else{
			double difference2 = totalPortValue - oldTotal;
			System.out.println("You have gained $" + difference2);
		}
	}
	else{
		System.out.println("Thank you for your service!");
	}
	}
  }
  
}
