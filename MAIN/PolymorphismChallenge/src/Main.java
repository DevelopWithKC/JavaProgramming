class Car
{
    private boolean engine;
    private String name;
    private int cylinders, wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;

    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine()
    {
        return "Car -> Start Engine";
    }

    public String accelerate()
    {
        return "Car -> Accelerate";
    }

    public String brake()
    {
        return  "Car -> Brake";
    }
}

class Mitsubishi extends Car
{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> Accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> Brake";
    }
}


public class Main {

    public static void main(String[] args) {

    }
}
