public class Customer extends CheckingAccount {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer () {
        this("", "", null);
    }
    public Customer (String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    public Customer (String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName () {
        return this.firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public String getLastName () {
        return this.lastName;
    }
    public void setAcct (CheckingAccount acct) {
        this.acct = acct;
    }
    public CheckingAccount getAcct () {
        return this.acct;
    }
    public String toString () {
        if (acct == null)
            return this.firstName+" "+this.lastName+" doesn't have account.";
        else
            return "The "+this.firstName+" account has "+acct.getBalance()+" baht and "+acct.getCredit()+" credit.";
    }
    public boolean equals (Customer c) {
        if (this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName))
            return true;
        return false;
    }
}