package java_fundamentals;

public class Arrays_ques_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,56,7,14};
		int search=2;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(search==arr[i]) {
				index=i;
				break;
			}
		}
		System.out.println(index);
		
//		int index=findIndex(arr,search);
//		System.out.println(index);
	}
//	public static int findIndex(int array[],int target) {
//		for(int i=0;i<array.length;i++) {
//			if(target==array[i]) {
//				return i;
//			}
//		}
//		return -1;
//	}

	

}
