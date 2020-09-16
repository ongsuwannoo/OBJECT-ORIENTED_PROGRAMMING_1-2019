package lab5;

public class CheckingAccount extends Account {
    private double credit;

    public CheckingAccount () {
        this(0, "", 0);
    }
    public CheckingAccount (double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit (double credit) {
        if (credit < 0)
            System.out.println("Input number must be a positive integer.");
        else
            this.credit = credit;
    }
    public double getCredit () {
        return this.credit;
    }
    public void withdraw (double a) {
        if (a > 0 && (this.balance - a + this.credit) >= 0) {
            if (this.balance - a >= 0){
                this.balance -= a;
            } else if (this.balance - a + this.credit >= 0){
                this.balance = 0;
                this.credit += this.balance - a;
            }
            System.out.println(a+" baht is withdrawn from "+this.name+" and your credit balance is "+this.credit);
        } else
        System.out.println("Not enough money!");
    }
    public void withdraw (int a) {
        if (a > 0 && (this.balance - a + this.credit) >= 0) {
            if (this.balance - a >= 0){
                this.balance -= a;
            } else if (this.balance - a + this.credit >= 0) {
                this.balance = 0;
                this.credit += this.balance - a;
            }
            System.out.println(a+" baht is withdrawn from "+this.name+" and your credit balance is "+this.credit);
        } else
        System.out.println("Not enough money!");
    }
    public String toString () {
        return "The "+this.name+" account has "+this.balance+" baht and "+this.credit+" credit.";
    }
}