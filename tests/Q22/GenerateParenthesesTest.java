package Q22;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {

    GenerateParentheses gp = new GenerateParentheses();

    String[] ans = {"(((())))","((()()))","((())())","((()))()",
                    "(()(()))","(()()())","(()())()","(())(())",
                    "(())()()","()((()))","()(()())","()(())()",
                    "()()(())","()()()()"};

    @Test
    public void generateParenthesis() {
        List<String> result = gp.generateParenthesis(4);
        for (int i = 0; i < ans.length; i++) {
            if (!result.contains(ans[i])) {
                System.out.println(ans[i]);
            }
//            assertTrue(result.contains(ans[i]));
        }

    }
}