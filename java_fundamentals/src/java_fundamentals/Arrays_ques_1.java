package java_fundamentals;

public class Arrays_ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {16,2,3,4};
		int min=arr[0];
		int max=arr[0];
		for(int i: arr) {
			if(min>=i)
				min=i;
			if(max<=i) {
				max=i;
			}
			
		}
		System.out.println(min);
		System.out.println(max);
	}

}
