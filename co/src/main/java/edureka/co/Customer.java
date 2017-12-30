package edureka.co;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(200);
		ls.add(100);
		ls.add(400);
		
		ls.add(300);
		Collections.sort(ls, (a,b)->b.compareTo(a));

	System.out.println(ls);
		
		
	}

}
