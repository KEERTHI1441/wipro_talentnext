package oops_inheritance;
import java.util.*;
public class String_ques_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
//		StringBuilder s=new StringBuilder(m);
		String r=s.length()>=2 && s.charAt(0)=='x' && s.charAt(s.length()-1)=='x'? s.substring(1,s.length()-1):s;
		System.out.println("the output: "+r);
	}

}
