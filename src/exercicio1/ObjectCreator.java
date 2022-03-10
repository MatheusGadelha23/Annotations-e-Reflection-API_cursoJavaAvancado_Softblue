package exercicio1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectCreator {
	
	/**
	 * Método estático que tem a função de receber um objeto Class parametrizado como parâmetro, 
	 * criar um objeto através desse Class, varrer os métodos que esse objeto criado possui, 
	 * verificar quais desses métodos é anotado com a anotação Init e invocar
	 * esses métodos. Por fim, retorna o objeto criado.
	 * @param <T>
	 * @param clazz
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws InstantiationException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 */
	public static <T> T create(Class<T> clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		
		// Instancia objeto através do Objeto Class
		T myClass = clazz.getDeclaredConstructor().newInstance(); 
		
		//Obtém a lista de métodos da classe
		Method[] methods = clazz.getDeclaredMethods();
		
		//Itera sobre a lista de métodos obtida
		for(Method method: methods) {
			
			//// Obtém a anotação @Init do método. Se ele não tiver a anotação, retorna null
			Init anotado = method.getDeclaredAnnotation(Init.class);
			
			// Se houver a anotação, invoca o método no objeto recém criado
			if (anotado != null && anotado.runOnInstantiation()) {
				method.invoke(myClass, (Object[]) null);
			}
		}
		
		//Retorna o objeto criado
		return myClass;
	}
}
