package lab12;



import org.junit.Test;
import static org.junit.Assert.*;

public class ExpressionParserTest {
    @Test
    public void testEvaluateExpression_SimpleAddition() {
        String expression = "3 + 5";
        int result = ExpressionParser.evaluateExpression(expression);
        assertEquals(8, result);
    }

    @Test
    public void testEvaluateExpression_MixedOperators() {
        String expression = "3 + 5 * 2";
        int result = ExpressionParser.evaluateExpression(expression);
        assertEquals(13, result);
    }

    @Test
    public void testEvaluateExpression_WithParentheses() {
        String expression = "3 + (5 * 2)";
        int result = ExpressionParser.evaluateExpression(expression);
        assertEquals(13, result);
    }

    @Test
    public void testEvaluateExpression_InvalidExpression() {
        String expression = "3 + + 5";
        try {
            ExpressionParser.evaluateExpression(expression);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected exception
        }
    }
}
