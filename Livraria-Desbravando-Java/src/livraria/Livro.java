package livraria;

public class Livro{

	private String nome;
	private	String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso;
	
	//construtor que deve receber um Autor como parametro
	
	public Livro(Autor autor) {
		this.autor=autor;
		this.isbn="000-00-00000-00-0";
		this.impresso=true;
	}
	
	

	public Livro() {
	

	}

	


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

	
	boolean temAutor() {
		return this.autor!=null;
	}
	
	
	
	public boolean  aplicaDescontoDe(double porcentagem) {
		
		if(porcentagem>0.3) {
			return false;
		
		}
		double desconto = this.getValor()*porcentagem;
		
		this.setValor(this.getValor()-desconto);
		return true;
	}



	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getDescricao() {
		return descricao;
	}




	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}




	public double getValor() {
		return valor;
	}




	public void setValor(double valor) {
		this.valor = valor;
	}




	public String getIsbn() {
		return isbn;
	}




	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}





	public Autor getAutor() {
		return autor;
	}





	public void setAutor(Autor autor) {
		this.autor = autor;
	}




	
	


	

}
