public class VipCustomer {

    public VipCustomer()
    {
        this("EmptyName", "empty@email.com", 50000.0);
    }

    public VipCustomer(String name, String emailAddress) {
        this("Unknown", "empty@email.com", 50000.0);
    }

    public VipCustomer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    private String name, emailAddress;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


}
