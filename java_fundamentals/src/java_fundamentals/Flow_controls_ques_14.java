package java_fundamentals;

public class Flow_controls_ques_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1234;
		int sum=0;
		for(;s>0;s=s/10) {
			int n=s%10;
			sum=sum+n;
		}
		System.out.println(sum);
	}

}
