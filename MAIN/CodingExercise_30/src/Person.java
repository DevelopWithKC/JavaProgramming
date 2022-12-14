public class Person {
    private String firstName, lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if ((age < 0) || (age > 100))
            this.age = 0;

        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen()
    {
        return (this.age > 12) && (this.age < 20);
    }

    public String getFullName()
    {
        if ((this.firstName.isEmpty()) && (this.lastName.isEmpty()))
            return " ";

        else if (this.firstName.isEmpty()) {
            return this.lastName;
        }

        else if (this.lastName.isEmpty()) {
            return this.firstName;
        }
        else
            return this.firstName + " " + this.lastName;

    }


}
