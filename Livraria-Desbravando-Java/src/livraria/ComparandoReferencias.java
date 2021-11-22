package livraria;

public class ComparandoReferencias {

	public static void main(String[] args) {
		 
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo@rodrigo.com");
		autor.setCpf("852.741.963-98");
		
		Autor autor2=new Autor();
		autor2.setNome("Rodrigo Turini");
		autor2.setEmail("rodrigo@rodrigo.com");
		autor2.setCpf("852.741.963-98");
		
		if(autor.equals(autor2)) {
			System.out.println("Iguais, mesmo autor");
		}else {
			System.out.println("Por que diferentes?");
		}
		

		Livro livro= new Livro();
		livro.setAutor(autor);
		
	//	livro.autor.nome="Joao da Silva";
		
	//	System.out.println(autor.nome);
		
	}

}
