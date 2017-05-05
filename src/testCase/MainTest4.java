package testCase;

import java.lang.reflect.Method;

public class MainTest4 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> appleClazz = Class.forName("testCase.Apple");
		Method[] ms = appleClazz.getDeclaredMethods();
		for(Method m : ms){
			System.out.println(m.toString());
		}
	}

}
