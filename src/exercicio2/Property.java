package exercicio2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Property {

	/**
	 * Método estático que tem como função invocar metódos do tipo 'set' do objeto passado no parâmetro utilando a Reflection API
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
		
		//Converte para maiuscúlo a primeira letra da String atributo passada como parâmetro e atribui à variável 'c'
		char c = Character.toUpperCase(atributo.charAt(0));
		//Cria uma String que representa um método 'set' do objeto 'obj' passado no parâmetro
		String setMethod = "set" + c + atributo.substring(1);
		
		//Procura o método dentro do objeto 'obj' passado no parâmetro como 'setMethod' e armazena em uma variável do tipo Method
		Method set = clazz.getDeclaredMethod(setMethod, valor.getClass());
		//Invoca o método encontrado
		set.invoke(obj, valor);
	}
	
	/**
	 * Método estático que tem como função invocar metódos do tipo 'get' do objeto passado no parâmetro utilando a Reflection API
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
		
		//Converte para maiuscúlo a primeira letra da String atributo passada como parâmetro e atribui à variável 'c'
		char c = Character.toUpperCase(atributo.charAt(0));
		//Cria uma String que representa um método 'get' do objeto 'obj' passado no parâmetro
		String getMethod = "get" + c + atributo.substring(1);
		
		//Procura o método dentro do objeto 'obj' passado no parâmetro como 'getMethod' e armazena em uma variável do tipo Method
		Method get = clazz.getDeclaredMethod(getMethod);
		//Invoca o método encontrado e armazena o retorno dentro de uma várivael 'retorno' do tipo Object
		Object retorno = get.invoke(obj);
		
		//Retorna o resultado do método invocado
		return (T) retorno;
	}
}
