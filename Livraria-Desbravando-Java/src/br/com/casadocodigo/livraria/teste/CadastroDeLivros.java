package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Santos Silva");
		autor.setEmail("santos@santos.com");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Era Uma Vez");
		
		livro.setDescricao("Novos recursos Brasil");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		livro.setAutor(autor);
		
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Ferreira Silva");
		outroAutor.setEmail("fereira@ferreira.com.br");
		outroAutor.setCpf("1258.963.741-89");
		
		
		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("Depois de uma noite em Claro");
		outroLivro.setDescricao("A história de um homem que não conseguia dormir");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("555-85-98741-12-1");
		
		outroLivro.setAutor(outroAutor);
		outroLivro.mostrarDetalhes();
		
		

		
		

	}

}
