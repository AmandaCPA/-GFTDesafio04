package modulo;

public class Livro extends Produto implements Imposto{
	private String autor;
	private String tema;
	private int qtdPag;
	
	
public Livro() {}
	
	public Livro(String nome, Double preco, int qtd, String autor, String tema, int qtdPag) {
		super (nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}
		
	public String getAutor() {
		return this.autor;
	}	
	public void setAutor(String x) {
		this.autor = x;
	}
	public String getTema() {
		return this.tema;
	}
	public void setTema(String x) {
		this.tema = x;
	}
	public int getQtdPag() {
		return this.qtdPag;
	}
	public void setQtdPag(int x) {
		this.qtdPag = x;
	}
	
	
	public Double calculaImposto() {
		if (this.tema.equals("Educativo")) {
			return 0.0;
		}else	
			return getPreco() * 0.10;
		}
		
}