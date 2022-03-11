package exercicio1;

/**
 * Classe que representa uma calculadora capaz de somar dois n�meros
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
	 * M�todo de inicializa��o do objeto, que ser� chamado logo ap�s o objeto ser constru�do.
	 * Se runOnInstantiation for definido como false, o m�todo n�o ser� chamado.
	 * O nome do m�todo � indiferente. O importante � a presen�a de @Init.
	 *
	 */
	@Init(runOnInstantiation = true)
	public void init() {
		this.numero1 = 10;
		this.numero2 = 20;
	}
	
	/**
	 * Soma dois n�meros
	 * @return a soma de dois n�meros
	 */
	public int somar() {
		return numero1 + numero2;
	}
	
	/**
	 * Multiplica dois n�meros
	 * @return a multiplica��o de dois n�meros
	 */
	public int multiplicar() {
		return numero1 * numero2;
	}

}
