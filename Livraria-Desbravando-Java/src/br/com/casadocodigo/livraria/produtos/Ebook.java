package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional {


	private String warterMark;
	

	public Ebook(Autor autor) {
		super(autor);
	}
	


	public String getWarterMark() {
		return warterMark;
	}


	public void setWarterMark(String warterMark) {
		this.warterMark = warterMark;
	}
	
	//Regra de desconto
@Override
	public boolean  aplicaDescontoDe(double porcentagem) {
		
		if(porcentagem>0.15) {
			return false;
		
		}
	
		return true;
	}

}
