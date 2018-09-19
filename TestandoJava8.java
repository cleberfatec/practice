package hackerRanck;

import java.util.Optional;

public class TestandoJava8 {

	public static void main(String[] args) {
		Integer valor = new Integer(10);		
		Optional<Integer> a = Optional.ofNullable(valor);		
		testarValor(a);
		
	}	

	
	public static boolean validar(Optional<Integer> valor) {
		return valor.isPresent();		
	}
	
	public static boolean testarValor(Optional<Integer> valor) {
		return valor.isPresent();		
	}

}
