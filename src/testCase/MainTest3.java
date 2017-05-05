package testCase;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTest3 {

	public static void main(String[] args) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Apple app = new Apple();
		app.setColor("blue");
		Class<?> clazz = Apple.class;
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields){
			PropertyDescriptor pd = new PropertyDescriptor(f.getName(), clazz);
			Method m =pd.getReadMethod();
			String pro = (String)m.invoke(app);
			System.out.println(f.getName());
			System.out.println(pro);
		}
	}
}
