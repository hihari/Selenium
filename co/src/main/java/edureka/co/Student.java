package edureka.co;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
		private String eName;
		private int eNo;
	Student(String eName, int eNo){
		this.eName = eName;
		this.eNo = eNo;
	}
	
	public void seteName(String eName){
		this.eName =eName;
	}
	
	public String geteName(){
		return this.eName;
	}
	
	public void seteNo(int eNo){
		this.eNo = eNo;
	}

	public int geteNo(){
		return this.eNo;
	}
	@Override
	public String toString(){
		return "Student name:"+eName + " eNo: "+eNo;
	}
	
	
	public static void main(String[] args) {
		
		Student std1 = new Student("Charlie",100);
		Student std2 = new Student("James",200);
		Student std3 = new Student("Lima",300);
		Student std4 = new Student("Mary",400);
		
		List<Student> al = new ArrayList<>();
		al.add(std4);
		al.add(std1);
		al.add(std2);
		al.add(std3);
		al.forEach(System.out::println);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		List<Integer> als= al.stream()
				.filter(s->s.geteNo()>200)
				.map(s -> s.geteNo())
				.collect(Collectors.toList());
		als.forEach(System.out::println);
		
		
		
	}



}
