package exercicio2;

import java.lang.reflect.InvocationTargetException;

public class Aplicacao {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Pessoa p = new Pessoa();
		Property.set(p, "nome", "Pedro");
		
		String nome = (String) Property.get(p, "nome", String.class);
		System.out.println(nome);
		
		Property.set(p, "idade", 26);
		
		Integer idade = (Integer) Property.get(p, "idade", Integer.class);
		System.out.println(idade);
	}

}
