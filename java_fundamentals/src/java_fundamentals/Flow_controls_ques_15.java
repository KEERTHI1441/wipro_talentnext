package java_fundamentals;

public class Flow_controls_ques_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0) {
			System.out.println("Provide an integer");
			return;
		}
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
