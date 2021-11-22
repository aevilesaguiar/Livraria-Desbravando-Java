package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Santos Silva");
		autor.setEmail("santos@santos.com");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new Livro(autor);
		livro.setNome("Era Uma Vez");
		
		livro.setDescricao("Novos recursos Brasil");
		livro.setValor(59.90);
		livro.setIsbn(" ");
		
		livro.setAutor(autor);
		
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Ferreira Silva");
		outroAutor.setEmail("fereira@ferreira.com.br");
		outroAutor.setCpf("1258.963.741-89");
		
		
		Livro outroLivro = new Livro(outroAutor);
		outroLivro.setNome("Depois de uma noite em Claro");
		outroLivro.setDescricao("A hist�ria de um homem que n�o conseguia dormir");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("555-85-98741-12-1");
		
		outroLivro.setAutor(outroAutor);
		outroLivro.mostrarDetalhes();
		
		

		
		

	}

}
