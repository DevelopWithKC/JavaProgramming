public class Main {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(25);
        calculator.setSecondNumber(12);

        System.out.println("The Numbers are " + calculator.getFirstNumber() + " and " + calculator.getSecondNumber());

        System.out.println("Addition = " + calculator.getAdditionResult());
        System.out.println("Subtraction = " + calculator.getSubtractionResult());
        System.out.println("Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Division = " + calculator.getDivisionResult());
    }
}
