public class CheckingAccount extends Account {
	//Set Over Draft Limit variable
    protected double OVERDRAFT_LIMIT = -100;
    //Checking account
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }
    //Withdraw from checking
    public void withdraw(double amount) {
        if (balance1 - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }
    //Display
    public String toString() {
        return "CheckingAccount{"+ "Balance=" + balance1 + '}';
    }
}