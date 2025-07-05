package java_fundamentals;

public class Flow_controls_ques_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		String reverse="";
		while(num>0){
			int n=num%10;
			reverse+=Integer.toString(n);
			num/=10;
		}
		System.out.println(reverse);
	}

}
//int num = 1234;
//StringBuilder reverse = new StringBuilder();
//
//while (num > 0) {
//    int n = num % 10;
//    reverse.append(n);
//    num /= 10;
//}
//
//System.out.println(reverse.toString());
