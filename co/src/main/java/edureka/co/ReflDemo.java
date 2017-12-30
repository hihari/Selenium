package edureka.co;


import java.lang.reflect.Method;


class ReflSamp{
	public static void samp1(){
		System.out.println("Hello Sample1");
	}
	public static void samp2(){
		System.out.println("Hello Sample2");
	}
}

public class ReflDemo {

	public static void main(String[] args) throws Exception {
		ActionKW act = new ActionKW();
		
		Method[] methods = act.getClass().getDeclaredMethods();
		
		for (Method method :methods){
			System.out.println(method.getName());
			method.invoke(method,"","Mozilla");
		}
		
	}

}
