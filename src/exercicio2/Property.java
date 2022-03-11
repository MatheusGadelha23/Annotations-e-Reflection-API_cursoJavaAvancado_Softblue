package exercicio2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Property {

	public static <T> void set(T obj, String atributo, T valor) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class<T> clazz = (Class<T>) obj.getClass();
		
		char c = Character.toUpperCase(atributo.charAt(0));
		String setMethod = "set" + c + atributo.substring(1);
		
		Method set = clazz.getDeclaredMethod(setMethod, valor.getClass());
		set.invoke(obj, valor);
	}
	
	public static <T> T get(T obj, String atributo, T valor) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<T> clazz = (Class<T>) obj.getClass();
		
		char c = Character.toUpperCase(atributo.charAt(0));
		String getMethod = "get" + c + atributo.substring(1);
		
		Method get = clazz.getDeclaredMethod(getMethod);
		Object retorno = get.invoke(obj);
		
		return (T) retorno;
	}
}
