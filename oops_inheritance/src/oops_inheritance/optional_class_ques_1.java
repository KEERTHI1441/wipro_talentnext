package oops_inheritance;
import java.util.*;
public class optional_class_ques_1 {
	String names[]=new String[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optional_class_ques_1 obj=new optional_class_ques_1();
		Optional<String> n=Optional.ofNullable(obj.names[0]);
		if(n.isPresent()) {
			System.out.println(obj.names[0].length());
		}else {
			System.out.println("no values");
		}
	}

}
