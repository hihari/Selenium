package edureka.co;
interface Core{
	public void sleep();
}

class Ucast{
	public void fun(){
		System.out.println("Hello parent fun");
	}
}
public class Dcast extends Ucast implements Core {
	public void fun(){
		System.out.println("Hello child fun");
	}
	public void cry(){
		System.out.println("Hello Cry");
	}
	
	public void sleep(){
		System.out.println("Hello Sleep");
	}
	
	public static void main(String[] args) {
		
		Ucast uc = new Dcast();
		Dcast dc = (Dcast) uc;
		dc.sleep();
		
	}
}
