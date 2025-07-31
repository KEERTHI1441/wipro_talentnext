package Collection;
import java.util.*;
public class List_ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> months = new ArrayList<>(Arrays.asList(
//			    "January", "February", "March", "April", "May", "June",
//			    "July", "August", "September", "October", "November", "December"
//			));
//		Creates a fixed-size list first, then wraps it in a resizable ArrayList
		
		
//		List<String> months = List.of(
//			    "January", "February", "March", "April", "May", "June",
//			    "July", "August", "September", "October", "November", "December"
//			);
//		Creates an immutable list — you can't add or remove elements.
		
		

		ArrayList<String> months=new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		System.out.println("Months of the Year:");
        for (String month : months) {
            System.out.println(month);
        }
//		System.out.println(months);
	}

}
