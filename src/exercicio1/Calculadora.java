package exercicio1;

/**
 * Classe que representa uma calculadora capaz de somar dois números
 */
public class Calculadora {
	
	/**
	 * Valor 1
	 */
	private int numero1;
	
	/**
	 * Valor 2
	 */
	private int numero2;
	
	/**
	 * 
	 * Método de inicialização do objeto, que será chamado logo após o objeto ser construído.
	 * Se runOnInstantiation for definido como false, o método não será chamado.
	 * O nome do método é indiferente. O importante é a presença de @Init.
	 *
	 */
	@Init(runOnInstantiation = true)
	public void init() {
		this.numero1 = 10;
		this.numero2 = 20;
	}
	
	/**
	 * Soma dois números
	 * @return a soma de dois números
	 */
	public int somar() {
		return numero1 + numero2;
	}
	
	/**
	 * Multiplica dois números
	 * @return a multiplicação de dois números
	 */
	public int multiplicar() {
		return numero1 * numero2;
	}

}
