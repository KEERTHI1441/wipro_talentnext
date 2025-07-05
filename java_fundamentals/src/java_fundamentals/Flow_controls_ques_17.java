package java_fundamentals;

public class Flow_controls_ques_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
		    System.out.println("Please provide a number");
		    return;
		}
		int n=Integer.parseInt(args[0]);
		int s=n;
		int temp=0;
		while(n>0) {
			int r=n%10;
			temp=temp*10+r;
			n=n/10;
		}
		if(s==temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
