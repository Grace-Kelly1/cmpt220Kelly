public class TestAccount {

	public static void main(String[] args) {
		// 9.7
		//Create account number
		//Create Interest Rate
		Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        
        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: " + account.getBalance());
        //Withdraw
        System.out.println("Withdraw $2,500");
        account.withdraw(2500);
        //Deposit
        System.out.println("Deposit $3,000");
        account.deposit(3000);
        //Display Account info
        System.out.println("Displaying updated info.");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Monthly interest rate: " + account.getMonthlyInterestRate());
        System.out.println("Date account was created: " + account.getDateCreated());


    }
	
}
