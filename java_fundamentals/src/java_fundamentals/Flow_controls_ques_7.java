package java_fundamentals;

public class Flow_controls_ques_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0){
			System.out.println("Doen't provide a character");
			return;
		}
		char alpha=args[0].charAt(0);
		if(Character.isLetter(alpha)) {
			if(Character.isLowerCase(alpha)) {
				System.out.println(alpha+" -> "+Character.toUpperCase(alpha));
			}else {
				System.out.println(alpha+" -> "+Character.toLowerCase(alpha));
			}
		}else {
			System.out.println("Invalid Character");
			
		}
	}

}
