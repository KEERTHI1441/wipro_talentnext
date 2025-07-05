package java_fundamentals;
import java.util.*;
public class Flow_controls_ques_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var='2';
		if (('a'<= var && var <='z') ||('A'<=var && var<='Z')){
			System.out.println("Alphabet");
		}else if('0'<=var && var<='9') {
			System.out.println("Number");
		}else {
			System.out.println("Special symbol");
		}
		
	}

}
