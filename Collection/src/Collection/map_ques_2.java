package Collection;

import java.util.*;

public class map_ques_2 {

	private HashMap<String,String> hm=new HashMap<>();
	
	public map_ques_2 (HashMap<String, String> hm) {
		this.hm = hm;
	}
	 public void addEntry(String key, String value) {
	        hm.put(key, value);
	    }
	public boolean checkKey(String s) {
		return hm.containsKey(s);
	}
	public boolean checkValue(String s) {
		for(String k:hm.keySet()) {
			if(s.equalsIgnoreCase(hm.get(k))) {
				return true;
			}
		}
		return false;
	}
	public void print() {
		Iterator<String> i=hm.keySet().iterator();
		while(i.hasNext()) {
			String key = i.next();
			System.out.println(key+" "+hm.get(key));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map_ques_2 obj=new map_ques_2(new HashMap<>());
		obj.addEntry("mahesh babu", "dfmb");
        obj.addEntry("ntr", "tigers");
        obj.addEntry("pk", "pawalas");
        obj.addEntry("bhAAi", "cake");
        
		System.out.println(obj.checkKey("ntr"));
		System.out.println(obj.checkValue("cake"));
		obj.print();
	}

}