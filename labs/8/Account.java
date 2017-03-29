import java.util.Date;

public class Account {

    protected String name1;
    protected int id1;
    protected double balance1;
    protected double annualInterestRate1; 
    protected Date dateCreated1;

    public Account() {
        dateCreated1 = new Date();
    }

    public Account(int id, double balance) {
        this();
        id1 = id;
        balance1 = balance;
    }

    public Account(String name, int id, double balance) {
        this(id, balance);
        name1 = name;

    }
    //Id
    public int getId() {
        return id1;
    }
    public void setId(int id) {
        id1 = id;
    }
    // Balance
    public double getBalance() {
        return balance1;
    }
    public void setBalance(double balance) {
        balance1 = balance;
    }
    //Annual interest Rate
    public double getAnnualInterestRate() {
        return annualInterestRate1;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        annualInterestRate1 = annualInterestRate;
    }
    //Date Created
    public Date getDateCreated() {
        return dateCreated1;
    }
    //Monthly Interest Rate
    public double getMonthlyInterestRate() {
        return balance1 * (annualInterestRate1 / 12) / 100;
    }
    //Withdraw and Deposit
    public void withdraw(double amount) {
        balance1 -= amount;
    }
    public void deposit(double amount) {
        balance1 += amount;
    }

}
