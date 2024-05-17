package part_two.stack;

import java.util.Stack;

public class Calculator {
    private final Stack<Double> operands;
    private final Stack<Character> operators;

    public Calculator() {
        this.operands = new Stack<>();
        this.operators = new Stack<>();
    }

    /** Add new operand */
    public void pushOperand(Double operand){
        operands.push(operand);
    }

    /** Remove last operand */
    public Double popOperand(){
        if(operands.isEmpty()){
            throw new IllegalStateException("Operands is empty, can't perform the action");
        }
        return operands.pop();
    }

    /** Add new operator */
    public void pushOperators(Character operator){
        operators.push(operator);
    }

    /** Remove last operator */
    public char popOperators(){
        if(operators.isEmpty()){
            throw new IllegalStateException("Operators is empty, can't perform the action");
        }
        return operators.pop();
    }

    /** Calculate the finale result */
    public double calculate(){
        if(this.operands.size() != this.operators.size() + 1){
            throw new IllegalArgumentException("Your expression is not valid");
        }

        while(!operators.isEmpty()){
            char operator = this.popOperators();
            double valueOne = this.popOperand();
            double valueTwo = this.popOperand();

            double result = this.evaluate(valueOne, valueTwo, operator);
            operands.push(result);
        }

        return operands.pop();
    }

    /** Perform the calculation based on the arithmetic operator */
    private double evaluate(double valueOne, double valueTwo, char operator){
        return switch (operator) {
            case '+' -> valueOne + valueTwo;
            case '-' -> valueOne - valueTwo;
            case '*' -> valueOne * valueTwo;
            case '/' -> {
                if (valueTwo == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                yield valueOne / valueTwo;
            }
            default -> throw new IllegalArgumentException("Your operator is not supported");
        };
    }
}
