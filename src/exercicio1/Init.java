package exercicio1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author Matheus Gadelha
 * Anottation utilizada para informar se um m�todo deve ser invocado ou n�o
 * no momento da instancia��o de um objeto
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Init {
	boolean runOnInstantiation() default true;
}
