public class AccountTest {
	public static void main(String[] args) {
		// 11.3
		//Create Account, checking and savings
        Account account = new Account(100, 200);
        CheckingAccount checkingAccount = new CheckingAccount(110, 250);
        SavingsAccount savingsAccount = new SavingsAccount(111, 300);
        //Display
        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }
}
