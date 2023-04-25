package T3;

import java.util.Stack;

/**
 * @author Pere Prior
 */
public class Calculator {

    private static final String OPERATORS = "+-*/";
    private static final double ERROR = Double.NaN;

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
                if(stack.size()<2){
                    return ERROR;
                } else {
                    operator(stack,c);
                }
            }
        }

        if (stack.isEmpty()){
            return ERROR;
        }

        return stack.pop();
    }

    private static void operator(Stack<Double> stack, char operator) {
        double firstNumber = stack.pop();
        double secondNumber = stack.pop();

        switch (operator) {
            case '+':
                stack.add(secondNumber + firstNumber);
                break;
            case '-':
                stack.add(secondNumber - firstNumber);
                break;
            case '*':
                stack.add(secondNumber * firstNumber);
                break;
            case '/':
                stack.add(secondNumber / firstNumber);
                break;
        }
    }

}