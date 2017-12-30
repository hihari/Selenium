package edureka.co;



public class OutClass {
	int x = 10;
	class InClass{
		int x = 100;
		public void m1(){
			int x = 1000;
			System.out.println(OutClass.this.x);
		}
	}

	public static void main(String[] args) {

		OutClass.InClass oc = new OutClass().new InClass();
		oc.m1();
		
	}

}
