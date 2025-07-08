package oops_inheritance;
import java.util.*;
public class String_ques_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String res=(s1.length()<s2.length())?s1+s2+s1 : s2+s1+s2;
//		if(s1.length()>s2.length()) {
//			System.out.println(s2+s1+s2);
//		}else {
//			System.out.println(s1+s2+s1);
//		}
		System.out.println(res);
	}

}
