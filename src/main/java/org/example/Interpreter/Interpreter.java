package org.example.Interpreter;

import java.util.LinkedList;

public class Interpreter {

    public static Expression parse(String expression) {
        String[] text = expression.split("");
        LinkedList<Expression> numbers = new LinkedList<>();
        LinkedList<String> operators = new LinkedList<>();

        for (var el : text) {
            if (isOperator(el)) {
                operators.add(el);
            } else if (el.matches("-?\\d+")){
                int number = Integer.parseInt(el);
                numbers.add(new NumberExpression(number));
            }
        }

        while (!operators.isEmpty() && numbers.size() >= 2) {
            String operator = operators.removeFirst();
            Expression left = numbers.removeFirst();
            Expression right = numbers.removeFirst();
            numbers.addFirst(new OperationExpression(left, right, operator));
        }


        return numbers.getFirst();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-");
    }

    public static void main(String[] args) {
        String input = "5 + 2 - 3 + 2";
            Expression expression = parse(input);
            int result = expression.interpret();
            System.out.println("Result: " + result);

    }
}
