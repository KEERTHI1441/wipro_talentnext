package oops_inheritance;
import java.util.*;
public class String_ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		s=s.substring(s.length()-n);
		StringBuilder res=new StringBuilder();
		for(int i=0;i<n;i++) {
			res.append(s);
		}
		System.out.println(res);
		
	}

}
