package livraria.labs;

public class ContinueEBreak {

	public static void main(String[] args) {

		//continue usado para pualr uma iteração de seu looping e forçar executar oo proximo codigo
		//o codigo vai imprimir todos os numeros de 0  10 , mais vai pular o 7
		
		
		for(int i=0;i<10;i++) {
			
			if(i==7) {
				continue;
			}
	System.out.println(i);	
		
		}
		
		
		System.out.println("===========================================");
		
		//para o código usando break
		
		for(int i=1; i<10;i++) {
			if(i==7) {
				break;
			}
			
			System.out.println(i);
		}

	}

}
