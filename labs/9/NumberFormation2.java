public class NumberFormation2 {
	//12.1
	public static void main(String[] args) {
	if (!isNumeric(tokens[0])) {
     System.out.println("Error \""+tokens[0]+"\" is not numeric.");
     System.exit(0);
	}
	if (!isNumeric(tokens[2])) {
		System.out.println("Error \""+tokens[2]+"\" is not numeric.");
	}
    System.exit(0);
	// Determine the operator
	switch (tokens[1].charAt(0)) {
		case '+': result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
          break;
     case '-': result = Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[2]);
          break;
      case '*': result = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[2]);
          break;
      case '/': result = Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[2]);
  }
	
	public static boolean isNumeric(String s) {
		for (char ch : s.toCharArray()) {
			if (ch < '0' || ch > '9') return false;
		}
		return true;
}
}
