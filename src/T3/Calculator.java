package T3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Pere Prior
 */
public class Calculator {

    private static final String OPERATORS = "+-*/";

    public static double arithmeticOperations(String message) {
        Stack<Double> stack = new Stack<>();
        StringBuilder numberBuilder = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                numberBuilder.append(c);
            } else if (c == ' ') {
                if (!numberBuilder.isEmpty()){
                    stack.add(Double.parseDouble(numberBuilder.toString()));
                    numberBuilder.setLength(0);
                }
            } else if (OPERATORS.contains(String.valueOf(c))) {
                operator(stack,c);
            }
        }
        return stack.pop();
    }

    private static void operator(Stack<Double> queue, char operator) {
        double firstNumber = queue.pop();
        double secondNumber = queue.pop();

        switch (operator) {
            case '+':
                queue.add(secondNumber + firstNumber);
                break;
            case '-':
                queue.add(secondNumber - firstNumber);
                break;
            case '*':
                queue.add(secondNumber * firstNumber);
                break;
            case '/':
                queue.add(secondNumber / firstNumber);
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

}