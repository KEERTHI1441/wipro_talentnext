package java_fundamentals;
import java.util.*;
public class Flow_controls_ques_1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Positive integer");
		}else if(a<0){
			System.out.println("Negative number");
		}else {
			System.out.println("Zero");
		}
	}

}
