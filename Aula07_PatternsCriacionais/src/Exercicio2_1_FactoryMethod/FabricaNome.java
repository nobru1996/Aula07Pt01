package Exercicio2_1_FactoryMethod;
/**
 * 
 * @author Bruno Gabriel
 * 			RA 816111491 - TURMA SI3AN-MCA
 *
 */
public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
