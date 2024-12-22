package lab12;
public class ExpressionParser {
    public static int evaluateExpression(String expression) {
        return parseExpression(expression.replaceAll("\\s", ""), 0).value;
    }

    private static ParseResult parseExpression(String expr, int index) {
        ParseResult current = parseTerm(expr, index);
        while (current.index < expr.length() && (expr.charAt(current.index) == '+' || expr.charAt(current.index) == '-')) {
            char operator = expr.charAt(current.index++);
            ParseResult next = parseTerm(expr, current.index);
            current.value = operator == '+' ? current.value + next.value : current.value - next.value;
            current.index = next.index;
        }
        return current;
    }

    private static ParseResult parseTerm(String expr, int index) {
        ParseResult current = parseFactor(expr, index);
        while (current.index < expr.length() && (expr.charAt(current.index) == '*' || expr.charAt(current.index) == '/')) {
            char operator = expr.charAt(current.index++);
            ParseResult next = parseFactor(expr, current.index);
            current.value = operator == '*' ? current.value * next.value : current.value / next.value;
            current.index = next.index;
        }
        return current;
    }

    private static ParseResult parseFactor(String expr, int index) {
        if (expr.charAt(index) == '(') {
            ParseResult nested = parseExpression(expr, index + 1);
            return new ParseResult(nested.value, nested.index + 1); // Skip closing parenthesis
        }
        int start = index;
        while (index < expr.length() && Character.isDigit(expr.charAt(index))) {
            index++;
        }
        return new ParseResult(Integer.parseInt(expr.substring(start, index)), index);
    }

    static class ParseResult {
        int value;
        int index;

        ParseResult(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        String expression = "3 + 5 * (2 - 1)";
        System.out.println("Result: " + evaluateExpression(expression));
    }
}
