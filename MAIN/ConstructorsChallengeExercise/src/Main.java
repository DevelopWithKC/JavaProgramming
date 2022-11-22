public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123456789);
        bankAccount.setName("Kaustubh");
        bankAccount.setEmail("fosswithkc@gmail.com");
        bankAccount.setPhoneNumber(123654789);
        bankAccount.setBalance(25000);


        bankAccount.depositFunds(3500.25);
        System.out.println("====================================================================");
        bankAccount.withdrawFunds(13600);
    }


}
