public abstract class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.setBalance(balance);
    }

    public void deposit(double depositAmount){
        this.setBalance(this.balance += depositAmount);
    }

    public void withdraw(double withdrawAmount){
        this.setBalance(this.balance -= withdrawAmount);
    }

    public void setBalance(double balance){
        if(balance <= 0){
            this.balance = 0;
        }
        else {
            this.balance = balance;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public abstract void display();
}
