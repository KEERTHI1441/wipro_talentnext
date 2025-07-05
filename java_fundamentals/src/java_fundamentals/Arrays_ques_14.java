package java_fundamentals;
import java.util.*;
public class Arrays_ques_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=9) {
			System.out.println("Please enter 9 integer numbers");
            return;
		}
		int arr[][]=new int[3][3];
		int index = 0;

        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[index++]);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int maxnum = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > maxnum) {
                    maxnum = arr[i][j];
                }
            }
        }

        System.out.println("The biggest number in the given array is " + maxnum);
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("The given array is :");
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		int maxnum=arr[0][0];
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				if(arr[i][j]>maxnum) {
//					maxnum=arr[i][j];
//				}
//			}
//		}
//		System.out.println("The biggest number in the given array is "+maxnum);
	}
}
