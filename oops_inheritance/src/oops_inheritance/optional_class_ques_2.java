package oops_inheritance;
import java.util.*;
public class optional_class_ques_2 {
	String Address;
	String default_add="India";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optional_class_ques_2 obj=new optional_class_ques_2();
		Optional<String> n=Optional.ofNullable(obj.Address);
		System.out.println(n.orElse(obj.default_add));
		
	}

}
