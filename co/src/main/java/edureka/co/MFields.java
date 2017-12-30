
	
	package edureka.co;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.stream.Collector;
	import java.util.stream.Stream;

	public class MFields{
		
		public static void main(String[] args) {
			
		List<Person> al = new ArrayList<>();
		al.add(new Person("Mary",45,"U Street"));
		al.add(new Person("Mary",45,"A Street"));
		al.add(new Person("Jack",15,"Hight Street"));
		al.add(new Person("Adams",25,"Low Street"));
		al.add(new Person("Mary",40,"U Street"));
		al.add(new Person("Jeff",35,"Main Street"));	
		al.add(new Person("Jeff",30,"Main Street"));
		
		al.stream()
		.sorted(Comparator.comparing(Person::getpName).thenComparing(Person::getpAge).thenComparing(Person::getpAddress))
		.forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++");
		al.stream()
		.filter(p->p.pAge>35)
		.forEach(System.out::println);
		
				
				
				

			
			
			
		}
		
	}


