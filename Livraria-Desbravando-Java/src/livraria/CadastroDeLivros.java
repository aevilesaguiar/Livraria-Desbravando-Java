package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.nome="Santos Silva";
		autor.email="santos@santos.com";
		autor.cpf="123.456.789-10";
		
		Livro livro = new Livro();
		livro.nome="Era Uma Vez";
		livro.descricao="Novos recursos Brasil";
		livro.valor=59.90;
		livro.isbn="978-78-65896-45-6";
		
		livro.autor=autor;
		
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.nome="Ferreira Silva";
		outroAutor.email="fereira@ferreira.com.br";
		outroAutor.cpf="1258.963.741-89";
		
		
		Livro outroLivro = new Livro();
		outroLivro.nome="Depois de uma noite em Claro";
		outroLivro.descricao="A história de um homem que não conseguia dormir";
		outroLivro.valor=59.90;
		outroLivro.isbn="852-85-98741-12-1";
		
		outroLivro.autor=outroAutor;
		outroLivro.mostrarDetalhes();
		
		Livro livro1=new Livro();
		Livro livro2=new Livro();
		Livro livro3=new Livro();
		Livro livro4=new Livro();
		

	}

}
