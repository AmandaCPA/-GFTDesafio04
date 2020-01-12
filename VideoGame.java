package modulo;

public class VideoGame extends Produto implements Imposto{
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	
	public VideoGame() {}
	
	
	public VideoGame(String nome, Double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super (nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
		
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String x) {
	this.marca = x;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String x) {
		this.modelo = x;
	}
	public boolean getIsUsado() {
		return this.isUsado;
	}
	public void setIsUsado(boolean x) {
		this.isUsado = x;
	}
		
	
	public Double calculaImposto() 
	{
		if (this.isUsado == true) 
		{
			return getPreco() * 0.25;
		}
		else 
		{	
			return getPreco() * 0.45;
		}
	}
		
}
