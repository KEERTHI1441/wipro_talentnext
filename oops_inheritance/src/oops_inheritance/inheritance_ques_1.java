package oops_inheritance;



class Animal{
	void eat() {
		System.out.println("Animal eating");
	}
	void sleep() {
		System.out.println("Animal sleeping");
	}
}
class Bird extends Animal{
//	@Override
	void eat() {
		System.out.println("Bird eating");
	}
//	@Override
	void sleep() {
		System.out.println("Bird sleeping");
	}
	void fly() {
		System.out.println("Bird fying");
	}
}
public class inheritance_ques_1 {
	public static void main(String[] args) {
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}
