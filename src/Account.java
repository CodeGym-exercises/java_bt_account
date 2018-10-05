import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;


    public Account() {
        this.id = 0;
        this.balance = 0;

    }
    public Account(int id, double balance,double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate(){
        return (this.getAnnualInterestRate()/100)/12;
    }

    public double getMonthlyInterest(){
        return this.getMonthlyInterestRate()*this.balance;
    }

    public void withdraw(double w){
        this.balance += w;
    }

    public void deposit(double d){
        this.balance -= d;
    }

    public void display(){
        System.out.printf("ID: %d\nBalance: %e\nMonthlyInterest: %e\nDateCreated: ",this.getId(),this.getBalance(),this.getMonthlyInterest());
        System.out.print(this.getDateCreated());
    }

}
