package testCase;

public class MainTest1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> appleClazz = Class.forName("testCase.Apple");
		Object obj = appleClazz.newInstance();
		Apple apple = (Apple)obj;
		apple.state();
	}
}
