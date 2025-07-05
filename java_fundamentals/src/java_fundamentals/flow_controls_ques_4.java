package java_fundamentals;

public class flow_controls_ques_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<2) {
			System.out.println("Provide atleast two characters");
			return;
		}
		char a=args[0].charAt(0);
		char b=args[1].charAt(0);
		if(a>b) {
			System.out.println(b+","+a);
		}else {
			System.out.println(a+"s,"+b);
		}
		
	}

}
