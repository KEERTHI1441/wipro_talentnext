package oops_inheritance;

public class Person {
	private String name;
	Person(String name){
		this.name=name;
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	void display() {
		System.out.println("Person name: "+name);
	}
}
