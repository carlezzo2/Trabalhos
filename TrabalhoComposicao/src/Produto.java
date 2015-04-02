public class Produto {

	protected int id;
	protected String descricao;
	protected double preco;
	private Categoria categoria;

	public Produto(int id, String descricao, double preco, Categoria categoria) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	
	@Override
	public String toString() {
		return "Produto id= " + id + ", descricao= " + descricao + ", preco= "
				+ preco + ", " + categoria;
	}

}
