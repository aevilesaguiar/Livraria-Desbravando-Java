package livraria;

public class Ebook extends Livro {


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
	
	
@Override
	public boolean  aplicaDescontoDe(double porcentagem) {
		
		if(porcentagem>0.15) {
			return false;
		
		}
	
		return super.aplicaDescontoDe(porcentagem);
	}

}
