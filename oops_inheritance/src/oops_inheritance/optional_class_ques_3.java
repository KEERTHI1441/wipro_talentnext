package oops_inheritance;
import java.util.Optional;
class InvalidEmployeeException extends RuntimeException{
	public InvalidEmployeeException(String message) {
		super(message);
	}
}
public class optional_class_ques_3 {
	String Employee;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optional_class_ques_3 obj=new optional_class_ques_3();
		Optional<String> n=Optional.ofNullable(obj.Employee);

		System.out.println(n.orElseThrow(() -> new InvalidEmployeeException("InvalidEmployeeException")));


	}

}
