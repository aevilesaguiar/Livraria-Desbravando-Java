package livraria;

public class Livro{

	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;

	
	void mostrarDetalhes() {

		String mensagem ="Mostrando detalhes do Livro";
		System.out.println(mensagem);
		System.out.println("Nome do livro:"+nome);
		System.out.println("Descrição:"+descricao);
		System.out.println("Valor do livro:"+valor);
		System.out.println("ISBN:"+isbn);
		autor.mostrarDetalhes();
		System.out.println("--");
		
		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
		
		System.out.println("--");
		
		
	}
	
	public void  aplicaDescontoDe(Double porcentagem) {
		this.valor -=this.valor*porcentagem;
	}
	
	
	
	 boolean temAutor() {
	
		 boolean naoEhNull=this.autor !=null;
		 return naoEhNull;
	}
}
