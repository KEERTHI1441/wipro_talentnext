package oops_inheritance;

class Shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
	void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing Triangle");
	}
	void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing Square");
	}
}
public class override_polymorphism_ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		
	}

}
