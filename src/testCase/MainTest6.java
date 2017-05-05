package testCase;

public class MainTest6 {

	
	public static void main(String[] args) {
		Class<?> clazz = Apple.class;
		Class<?>[] ins = clazz.getInterfaces();
		for(Class<?> c : ins){
			System.out.println(c.getName());
		}
	}
}
