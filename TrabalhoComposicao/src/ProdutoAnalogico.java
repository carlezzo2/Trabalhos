public class ProdutoAnalogico {

	private double peso;
	private double dimensoes;
	private Produto produto;

	public ProdutoAnalogico(double peso, double dimensoes, Produto produto) {

		this.peso = peso;
		this.dimensoes = dimensoes;
		this.produto = produto;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(double dimensoes) {
		this.dimensoes = dimensoes;
	}

	public Produto getProduto() {
		return produto;
	}


	@Override
	public String toString() {
		return "ProdutoAnalogico peso= " + peso + ", dimensoes= " + dimensoes
				+ ", " + produto;
	}

}
