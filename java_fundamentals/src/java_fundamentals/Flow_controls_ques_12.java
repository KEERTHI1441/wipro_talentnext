package java_fundamentals;

public class Flow_controls_ques_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		if(isPrime(num)) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a prime number");
		}
		
	}
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		if(num==2) return true;
		if(num%2==0) return false;
		for(int i=3;i<=Math.sqrt(num);i++) {
			if(i%2==0)return false;
		}
		return true;
	}

}
