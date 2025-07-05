package java_fundamentals;

public class Arrays_ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,4,7,6,5,8,31,11,10};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				temp[j++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				temp[j++]=arr[i];
			}
		}
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(temp[i]);
			if(i<temp.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

}
