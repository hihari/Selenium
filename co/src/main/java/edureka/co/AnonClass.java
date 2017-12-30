package edureka.co;

interface Message{
	public String greet();
		
	
}


public class AnonClass {
	
	public void displayMsg(Message m){
		System.out.println("display message is "+m.greet());
	}
	
	

	public static void main(String[] args) {
		
		AnonClass ac = new AnonClass();
		ac.displayMsg(new Message(){
			public String greet(){
				return "hello";
				
				
			}

		
		});
				
	}

}
