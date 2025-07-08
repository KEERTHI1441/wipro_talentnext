package oops_inheritance;
import java.util.*;
public class StringJoiner_ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringJoiner s1=new StringJoiner("-");
		StringJoiner s2=new StringJoiner("-");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			s1.add(sc.next());
		}
		for(int i=0;i<n;i++) {
			s2.add(sc.next());
		}
		StringJoiner merged1 = new StringJoiner("-");
		merged1.setEmptyValue(s1.toString());
		merged1.merge(s2);

		StringJoiner merged2 = new StringJoiner("-");
		merged2.setEmptyValue(s2.toString());
		merged2.merge(s1);
		
		StringJoiner s1Copy = new StringJoiner("-");
		for (String part : s1.toString().split("-")) {
		    s1Copy.add(part);
		}

		StringJoiner s2Copy = new StringJoiner("-");
		for (String part : s2.toString().split("-")) {
		    s2Copy.add(part);
		}

		System.out.println("s1 megerd to s2 "+s1Copy.merge(s2Copy)); // s1 merged to s2
		System.out.println("s2 merged to s1"+s2.merge(s1));         // s2 merged to s1 (s2 will be altered now)

//
//		System.out.println("s2 merged to s1"+s1.merge(s2));
//		System.out.println("s1 megerd to s2"+s2.merge(s1));
		
	}

}
