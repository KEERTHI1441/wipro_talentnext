package java_fundamentals;

public class Arrays_ques_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,34,12,45,67,89};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			boolean isDuplicate=false;
			for(int k=0;k<j;k++) {
				if(arr[i]==temp[k]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[j]=arr[i];
				j++;
			}
		}
		System.out.print("{");
		for(int i=0;i<j;i++) {
			System.out.print(temp[i]);
			if(i<j-1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}

}
