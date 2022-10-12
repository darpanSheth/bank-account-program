public class Checking extends BankAccount{
    final int SERVICE_FEE = 1;
    Checking(double balance){
        super(balance);
    }
    public void writeACheck(double checkAmount){
        this.setBalance(this.getBalance() - checkAmount - SERVICE_FEE);
    }

    @Override
    public void display() {
        System.out.printf("Checking account balance: $%,.2f\n", this.getBalance());
    }
}
