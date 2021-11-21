package livraria;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {


		
		double soma=0;
		int contador =0;
		/*
		while(contador<35) {
			double valorDoLivro = 59.90;
			soma += valorDoLivro;
			contador++;
			//System.out.println("total"+soma);
		}*/
		
		
		for(int i=0; i<35;i++ ) {
			
			soma+=59.90;
			
		}
	System.out.println(" O total de estoque é :"+ soma);
		
		
		if(soma<150) {
			System.out.println("Estoque baixissimo");
			
		}else if(soma>=2000) {
			System.out.println("Seu estoque está alto!");
		}else {
			System.out.println("Seu estoque está bom!");
		}
		
	}

}
