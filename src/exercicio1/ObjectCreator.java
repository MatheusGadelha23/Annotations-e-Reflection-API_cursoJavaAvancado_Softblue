package exercicio1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectCreator {
	
	/**
	 * M�todo est�tico que tem a fun��o de receber um objeto Class parametrizado como par�metro, 
	 * criar um objeto atrav�s desse Class, varrer os m�todos que esse objeto criado possui, 
	 * verificar quais desses m�todos � anotado com a anota��o Init e invocar
	 * esses m�todos. Por fim, retorna o objeto criado.
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
		
		// Instancia objeto atrav�s do Objeto Class
		T myClass = clazz.getDeclaredConstructor().newInstance(); 
		
		//Obt�m a lista de m�todos da classe
		Method[] methods = clazz.getDeclaredMethods();
		
		//Itera sobre a lista de m�todos obtida
		for(Method method: methods) {
			
			//// Obt�m a anota��o @Init do m�todo. Se ele n�o tiver a anota��o, retorna null
			Init anotado = method.getDeclaredAnnotation(Init.class);
			
			// Se houver a anota��o, invoca o m�todo no objeto rec�m criado
			if (anotado != null && anotado.runOnInstantiation()) {
				method.invoke(myClass, (Object[]) null);
			}
		}
		
		//Retorna o objeto criado
		return myClass;
	}
}
