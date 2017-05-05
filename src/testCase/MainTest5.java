package testCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainTest5 {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Apple apple = new Apple();
		Class<?> clazz = apple.getClass();
		Constructor<?>[] cons = clazz.getDeclaredConstructors();
		for(Constructor<?> con : cons){
			System.out.println(con.getParameterTypes().toString());
		}
	}

}
