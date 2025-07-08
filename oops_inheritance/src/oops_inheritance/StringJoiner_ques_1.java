package oops_inheritance;
import java.util.*;
public class StringJoiner_ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> s=new ArrayList<String>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			s.add(sc.next());
		}
		StringJoiner s1=new StringJoiner(",","{","}");
		s.forEach(element ->s1.add(element) );
		System.out.println(s1);
	}

}
