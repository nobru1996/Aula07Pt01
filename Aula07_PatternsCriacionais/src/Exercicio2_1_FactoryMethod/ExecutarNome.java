package Exercicio2_1_FactoryMethod;

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Bruno";
		String sobrenome = "Gabriel";
		
		fn.getNome(nome, sobrenome);

	}

}