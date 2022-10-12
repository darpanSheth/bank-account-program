public class Savings extends BankAccount{
    private double intRate;

    public Savings(double balance, double intRate){
        super(balance);
        this.intRate = intRate;
    }

    public void addIntRate(){
        this.setBalance(this.getBalance() + (this.intRate * this.getBalance()));
    }

    @Override
    public void display() {
        System.out.printf("Savings account balance: $%,.2f\n", super.getBalance());
    }
}
