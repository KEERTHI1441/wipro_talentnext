package oops_inheritance;

public class class_obj_ques_2 {
	
	class Calculator{
		static double powerInt(int num1,int num2) {
			return Math.pow(num1,num2);
		}
		static double powerDouble(double num1,int num2) {
			return Math.pow(num1, num2);
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double x=Calculator.powerInt(2, 2);
//		double y=Calculator.powerDouble(2.2, 2);
		System.out.println(Calculator.powerDouble(2, 2)+"\t"+Calculator.powerInt(4, 2));
//		System.out.println(x+"\t"+y);
	}

}
