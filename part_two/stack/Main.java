package part_two.stack;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.pushOperand(2.0);
        calculator.pushOperators('+');
        calculator.pushOperand(5.0);
        calculator.pushOperators('*');
        calculator.pushOperand(2.0);

        System.out.println(calculator.calculate());
    }
}
