package oops_inheritance;
class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return "Author Name: "+name+", Email: "+email+", Gender: "+gender;
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	void getBook() {
		System.out.println("Book name: "+name);
		System.out.println("Author info: "+author);
		System.out.println("Price: "+price);
		System.out.println("qtyInStocck: "+qtyInStock);
	}
}
public class encapsulation_inheitance_ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author("David","david@gmail.com",'M');
		Book b=new Book("HarryPotter",a,4444,1);
		b.getBook();
	}

}
