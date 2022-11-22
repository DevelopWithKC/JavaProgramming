public class BankAccount {
    private long accountNumber, phoneNumber;
    private double balance;
    private String name, email;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void depositFunds(double funds)
    {
        System.out.println("Account Balance before deposit: " + this.balance);

        balance += funds;

        System.out.println("Account balance after deposit: " + this.balance);

    }

    public void withdrawFunds(double funds)
    {
        System.out.println("Total Balance in Account: " + this.balance);
        if (funds > this.balance)
            System.out.println("Insufficient Balance, Cannot withdraw the given amount");
        else
        {
            this.balance -= funds;
            System.out.println("Remaining balance after withdrawing " + funds + " from your account" +
                    " with account number " + this.accountNumber + " is " + this.balance);
        }
    }
}
