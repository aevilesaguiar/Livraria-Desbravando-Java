package livraria;

public class ComparandoReferencias {

	public static void main(String[] args) {
		 
		Autor autor = new Autor();
		autor.nome="Rodrigo Turini";
		autor.email="rodrigo@rodrigo.com";
		autor.cpf="852.741.963-98";
		
		Autor autor2=new Autor();
		autor2.nome="Rodrigo Turini";
		autor2.email="rodrigo@rodrigo.com";
		autor2.cpf="852.741.963-98";
		
		if(autor.equals(autor2)) {
			System.out.println("Iguais, mesmo autor");
		}else {
			System.out.println("Por que diferentes?");
		}
		

		Livro livro= new Livro();
		livro.autor=autor;
		
		livro.autor.nome="Joao da Silva";
		
		System.out.println(autor.nome);
		
	}

}
