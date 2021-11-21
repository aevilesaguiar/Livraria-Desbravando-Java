package livraria.labs;

public class OperadorTernario {

	public static void main(String[] args) {

		
		double v1=100;
		double v2=10;
		double valor = 0;
		
		
		if(v1>v2) {
			valor =100;
		}else {
			valor=0;
		}
		
		System.out.println(valor);
		
		
		double valor3=v1>v2?100:0;
		
		System.out.println(valor3);
	}

}
