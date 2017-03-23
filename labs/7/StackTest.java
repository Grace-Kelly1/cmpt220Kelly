import java.util.Scanner;

public class StackTest {
	
	 public static void main(String[] args) {
		  	// 10.5
		 	//Scanner
		 	Scanner input = new Scanner(System.in);
	    	System.out.print("Enter a positive integer: ");
	    	int num = input.nextInt();
	    	//Create StackOfIntegers stack
	    	StackOfIntegers stack = new StackOfIntegers(20);
	    	int factor = 2;
	    	while (factor <= num) {
	        	if (num % factor == 0) {
	            	stack.push(factor);
	            	num /= factor;
	        	} else {
	            	factor++;
	        	}
	    	}
	    	while (!stack.empty()) {
	        	System.out.print(stack.pop() + " ");
	    	}
		}
	}

