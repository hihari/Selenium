package edureka.co;

import java.util.ArrayList;
import java.util.List;

public class CollDemo {
	
	public String test(){
		List<String> al = new ArrayList<String>();
		al.add("Hari");
		al.add("Jack");
		al.add("babu");
		al.add("John");
		al.add("John");
	for(int i=0; i<al.size();i++){
		
		if(al.get(i).equals("babu")){
			return al.get(i);
		}
		System.out.println(al.get(i));
	}
	return null;
	}

	public static void main(String[] args) throws Exception {
		
		CollDemo cd = new CollDemo();
		String rt = cd.test();
		System.out.println("This is from main method "+rt);
		

		
		
	}

}
