package exercicio2;

import java.lang.reflect.InvocationTargetException;

public class Aplicacao {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		//Cria um objeto do tipo Pessoa
		Pessoa p = new Pessoa();
		//Chama o m�todo est�tico 'set' da classe 'Property'
		Property.set(p, "nome", "Pedro");
		
		//Chama o m�todo est�tico 'get' da classe 'Property' e armazena o retorno em um vari�vel 'nome' do tipo String
		String nome = (String) Property.get(p, "nome", String.class);
		//Mostra na tela o valor armazenado na vari�vel 'nome'
		System.out.println(nome);
		
		//Chama o m�todo est�tico 'set' da classe 'Property'
		Property.set(p, "idade", 26);
		
		//Chama o m�todo est�tico 'get' da classe 'Property' e armazena o retorno em um vari�vel 'idade' do tipo Integer
		Integer idade = (Integer) Property.get(p, "idade", Integer.class);
		//Mostra na tela o valor armazenado na vari�vel 'idade'
		System.out.println(idade);
	}

}
