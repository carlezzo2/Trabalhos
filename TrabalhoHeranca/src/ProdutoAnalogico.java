public class ProdutoAnalogico extends Produto {

	private double peso;
	private double dimensoes;


	public ProdutoAnalogico(int id, String descricao, double preco,
			Categoria categoria, double peso, double dimensoes) {
		super(id, descricao, preco, categoria);
		this.peso = peso;
		this.dimensoes = dimensoes;
		

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


	@Override
	public String toString() {
		return "ProdutoAnalogico peso= " + peso + ", dimensoes= " + dimensoes
				+ ", id= " + id + ", descricao= " + descricao + ", preco="
				+ preco  +", "+ categoria;
	}


	
	

}
