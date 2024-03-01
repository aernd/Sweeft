import java.util.StringTokenizer;

public class ExpressionSolver {
    int evaluateExpression(String expression){
        if (expression == null) return 0;
        StringTokenizer st = new StringTokenizer(expression,"+-",true);
        int total = 0;
        boolean isOperatorPlus = true;
        boolean isLastOperator = false;
        while(st.hasMoreTokens()){
            String curToken = st.nextToken();
            if (curToken.equals("+") || curToken.equals("-")){
                if (isLastOperator) throw new IllegalArgumentException("Illegal expression");
                isOperatorPlus = curToken.equals("+");
                isLastOperator = true;
                continue;
            }
            int val = Integer.parseInt(curToken);
            total = isOperatorPlus ? total + val : total - val;
            isLastOperator = false;
        }
        if (isLastOperator) throw new IllegalArgumentException();
        return total;
    }
}
