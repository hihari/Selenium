package edureka.co;

public class MethLocal {
	
	public void m1( ){
		class InClass{
			
			public void sum(int i, int j){
				System.out.println("Sum is "+(i+j));
			}
			
	}
		
		InClass ic = new InClass();
		ic.sum(10, 20);
		ic.sum(20, 30);
		
		
}
	
	
	public static void main(String[] args) {
	
		MethLocal ml = new MethLocal();
		ml.m1();

	}

}
