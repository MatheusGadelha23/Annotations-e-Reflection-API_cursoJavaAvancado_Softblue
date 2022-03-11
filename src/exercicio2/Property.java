package exercicio2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Property {

	/**
	 * M�todo est�tico que tem como fun��o invocar met�dos do tipo 'set' do objeto passado no par�metro utilando a Reflection API
	 * @param <T>
	 * @param obj
	 * @param atributo
	 * @param valor
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 */
	public static <T> void set(T obj, String atributo, T valor) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		//Cria um objeto Class
		Class<T> clazz = (Class<T>) obj.getClass();
		
		//Converte para maiusc�lo a primeira letra da String atributo passada como par�metro e atribui � vari�vel 'c'
		char c = Character.toUpperCase(atributo.charAt(0));
		//Cria uma String que representa um m�todo 'set' do objeto 'obj' passado no par�metro
		String setMethod = "set" + c + atributo.substring(1);
		
		//Procura o m�todo dentro do objeto 'obj' passado no par�metro como 'setMethod' e armazena em uma vari�vel do tipo Method
		Method set = clazz.getDeclaredMethod(setMethod, valor.getClass());
		//Invoca o m�todo encontrado
		set.invoke(obj, valor);
	}
	
	/**
	 * M�todo est�tico que tem como fun��o invocar met�dos do tipo 'get' do objeto passado no par�metro utilando a Reflection API
	 * @param <T>
	 * @param obj
	 * @param atributo
	 * @param valor
	 * @return
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static <T> T get(T obj, String atributo, T valor) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//Cria um objeto Class
		Class<T> clazz = (Class<T>) obj.getClass();
		
		//Converte para maiusc�lo a primeira letra da String atributo passada como par�metro e atribui � vari�vel 'c'
		char c = Character.toUpperCase(atributo.charAt(0));
		//Cria uma String que representa um m�todo 'get' do objeto 'obj' passado no par�metro
		String getMethod = "get" + c + atributo.substring(1);
		
		//Procura o m�todo dentro do objeto 'obj' passado no par�metro como 'getMethod' e armazena em uma vari�vel do tipo Method
		Method get = clazz.getDeclaredMethod(getMethod);
		//Invoca o m�todo encontrado e armazena o retorno dentro de uma v�rivael 'retorno' do tipo Object
		Object retorno = get.invoke(obj);
		
		//Retorna o resultado do m�todo invocado
		return (T) retorno;
	}
}
