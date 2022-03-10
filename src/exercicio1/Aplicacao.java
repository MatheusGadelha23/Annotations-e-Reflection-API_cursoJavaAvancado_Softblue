package exercicio1;

import java.lang.reflect.InvocationTargetException;

public class Aplicacao {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException  {
		
		//Cria um Objeto calcClass através da Classe Calculadora
		Class<Calculadora> calcClass = Calculadora.class;
		
		//Chama o método estático create da classe ObjectCreator e armazena o resultado
		//em um objeto da classe Calculadora
		Calculadora calc = ObjectCreator.create(calcClass);
		
		//Chama o método somar do objeto calc
		System.out.println(calc.somar());
		
	}

}
