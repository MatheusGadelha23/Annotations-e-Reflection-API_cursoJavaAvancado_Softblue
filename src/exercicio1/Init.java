package exercicio1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author Matheus Gadelha
 * Anottation utilizada para informar se um método deve ser invocado ou não
 * no momento da instanciação de um objeto
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Init {
	boolean runOnInstantiation() default true;
}
