import java.util.Stack;

public class ParenthesesChecker {
    private String checker;

    //    this class was blank from git pull
//    private String checker;
//
    public void ParenthesesChecker(String checker){
        this.checker = checker;
    }

    public boolean checkParentheses(String testString) {
        if (testString.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < testString.length(); i++)
        {
            char current = testString.charAt(i);
            if (current == '{' || current == '(' || current == '['|| current == '<')
            {
                stack.push(current);
            }


            if (current == '}' || current == ')' || current == ']'|| current == '>')
            {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '['|| current == '>' && last == '<')
                    stack.pop();
                else
                    return false;
            }

        }

        return stack.isEmpty();
    }
}
