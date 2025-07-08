package oops_inheritance;
import java.util.*;
public class String_ques_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            // Skip if current char is '*'
            if (input.charAt(i) == '*') continue;

            // Skip if previous char was '*'
            if (i > 0 && input.charAt(i - 1) == '*') continue;

            // Skip if next char is '*'
            if (i < input.length() - 1 && input.charAt(i + 1) == '*') continue;

            result.append(input.charAt(i));
        }

        System.out.println("Output: " + result.toString());
		
		
	}

}
