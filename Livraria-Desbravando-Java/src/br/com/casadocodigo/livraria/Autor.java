package br.com.casadocodigo.livraria;

public class Autor {
	
	private String nome;
	private	String email;
	private String cpf;
	
	
	

	public void mostrarDetalhes() {
		String mensagem ="Mostrando detalhes do Autor";
		System.out.println("Nome do livro:"+nome);
		System.out.println("E-mail:"+email);
		System.out.println("CPF:"+cpf);
		System.out.println("--");
	}


	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Autor))return false;
		
		Autor outro = (Autor) obj;
		
		return this.nome.equals(outro.nome);
	}


	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
		
	}




