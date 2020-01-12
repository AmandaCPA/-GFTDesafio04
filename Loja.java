package modulo;

import java.util.List;

public class Loja {
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	
	public Loja() {}
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return this.livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return this.videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	

	
	public void listaLivros() {
		if (livros.isEmpty() == false) 
		{
			for (Livro l : livros) //foreach (varredura de todos o array "livros"
			{
				System.out.println("Titulo: " + l.getNome() + ", preço: " + l.getPreco()
				+ ", quantidade: " + l.getQtd() + " em estoque.");
			}
		}
		else
		{
			System.out.println("A loja não tem livros no seu estoque.");
		}
	}
	
	
	
	public void listaVideoGames() 
	{
		
		if (videoGames.isEmpty() == false) 
		{
			for (VideoGame vd : videoGames) //foreach (varredura de todos o array "livros"
			{
				System.out.println("Titulo: " + vd.getNome() + ", preço: " + vd.getPreco()
										+ ", quantidade: " + vd.getQtd() + " em estoque.");
			}
		}
		else
		{
			System.out.println("A loja não tem video-games no seu estoque");
		}
	}
	
	
	
	public Double calculaPatrimonio() {
		Double x; //variavel auxiliar
		x = 0.0;
		if (videoGames.isEmpty() == false) 
		{
			for (VideoGame vd : videoGames) //foreach (varredura de todos o array "video game"
			{
				x = x + (vd.getPreco() * vd.getQtd());
			}
		}
		if (livros.isEmpty() == false) 
		{
			for (Livro l : livros) //foreach (varredura de todos o array "livros"
			{
				x = x + (l.getPreco() * l.getQtd());
			}
		}
		return x; 
	}
}