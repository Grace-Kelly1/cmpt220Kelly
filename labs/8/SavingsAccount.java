public class SavingsAccount extends Account {
	//Set Over Draft Limit variable
    protected double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }
    //Withdraw from savings
    public void withdraw(double amount) {
        if (balance1 - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }
    //Display
    public String toString() {
        return "SavingsAccount{" + "Balance=" + balance1 + '}';
    }
}