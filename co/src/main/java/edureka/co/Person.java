package edureka.co;

public class Person {
	String pName;
	int pAge;
	String pAddress;
	
	Person(String pName,int pAge,String pAddress){
		this.pName = pName;
		this.pAge = pAge;
		this.pAddress =pAddress;
	}	
	
	
	
	
	
	
	public String getpName() {
		return pName;
	}






	public void setpName(String pName) {
		this.pName = pName;
	}






	public int getpAge() {
		return pAge;
	}






	public void setpAge(int pAge) {
		this.pAge = pAge;
	}






	public String getpAddress() {
		return pAddress;
	}






	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}






	public	String toString(){
		
		return pName+" "+pAge+" "+pAddress;
		
	}
	
//	public int compareTo(Person per){
//		
//	 if (pAge ==per.pAge) {
//		 return 0;
//	 }
//	 else if(pAge > per.pAge){
//		 return 1;
//	 }
//	 else return -1;
//	}
		
		
		
		
	}
	
	
	


