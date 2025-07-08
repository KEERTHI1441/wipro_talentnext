package oops_inheritance;



class Fruit{
	String name;
	String taste;
	String size;
	Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
	void eat() {
		System.out.println("A "+size+" of "+name+" is very tasty.");
	}
}
class Apple extends Fruit{
	 Apple(String size) {
	        super("Apple", "sweet", size);
	 }
	 @Override
	void eat() {
		System.out.println("A "+size+" of "+name+" is very tasty.");
	}
}
class Orange extends Fruit{
	Orange(String size) {
        super("Orange", "sour", size);
    }
	@Override
	void eat() {
		System.out.println("A "+size+" of "+name+" is very tasty.");
	}
}

public class override_polymorphism_ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple("small");
		Orange o=new Orange("large");
		Fruit f=new Fruit("any fruit", "no taste","medium");
		a.eat();
		o.eat();
		f.eat();
		
	}

}
