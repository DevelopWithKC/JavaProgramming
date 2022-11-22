public class Main {
    public static void main(String[] args) {

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmailAddress());

        System.out.println("=========================================================");

        VipCustomer person2 = new VipCustomer("Bob", "hello@email.com");
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailAddress());

        System.out.println("=========================================================");


        VipCustomer person3 = new VipCustomer("Kasutubh", "fosswithkc@gmail.com",
                567000);
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());
    }
}
