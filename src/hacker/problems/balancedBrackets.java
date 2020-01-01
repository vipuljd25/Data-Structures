package hacker.problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class balancedBrackets {
	
	
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	for (int i = 0; i < n; i++) {
		String s = sc.next();
		System.out.println(isMatched(s) ? "YES" : "NO");
	}

	sc.close();
}

static boolean isMatched(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(' || c == '[' || c == '{') {
			stack.push(c);
		} else {
			if (stack.isEmpty()) {
				return false;
			}

			char top = stack.pop();
			if (!((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))) {
				return false;
			}
		}
	}
	return stack.isEmpty();}}
