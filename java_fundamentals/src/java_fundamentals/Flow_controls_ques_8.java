package java_fundamentals;
import java.util.*;
public class Flow_controls_ques_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		switch(s) {
		case 'R': System.out.println("Red"); break;
		case 'B': System.out.println("Blue"); break;
		case 'G': System.out.println("Green"); break;
		case 'Y': System.out.println("Yellow"); break;
		case 'O': System.out.println("Orange"); break;
		case 'W': System.out.println("White"); break;
		default :  System.out.println("Invalid code");
		}
	}

}
