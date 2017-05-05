package testCase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTest2 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Apple apple = new Apple();
		testApple(apple);
		
	}
	
	public static void testApple(Object obj) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Class<?> clazz = obj.getClass();
		Method m = clazz.getMethod("state");
		m.invoke(obj);
	}

}
