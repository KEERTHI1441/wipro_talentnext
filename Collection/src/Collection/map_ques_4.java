package Collection;


import java.util.HashMap;
import java.util.Iterator;

public class map_ques_4 {

private HashMap<String, Integer> hm=new HashMap<>();
	
	public void addContact(String name,Integer num) {
		hm.put(name, num);
	}
	
	public boolean checkName(String name) {
		return hm.containsKey(name);
	}
	public boolean checkNum(Integer num) {
		return hm.containsValue(num);
	}
	public void print() {
		Iterator<String> i=hm.keySet().iterator();
		while(i.hasNext()) {
			String k=i.next();
			System.out.println(k+" - "+hm.get(k));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map_ques_4 obj=new map_ques_4();
		obj.addContact("bhAAi", 12345);
		obj.addContact("bob", 98765);
		obj.addContact("pk", 212121);
		obj.addContact("balayya", 34567);
		
		System.out.println(obj.checkName("pk"));
		System.out.println(obj.checkNum(12345));
		obj.print();
 }
}