public class ProdutoDigital extends Produto {

	private Formato formato;
	private double tamanhoEmKb;

	public ProdutoDigital(int id, String descricao, double preco,
			Categoria categoria, Formato formato, double tamanhoEmKb) {
		super(id, descricao, preco, categoria);
		this.formato = formato;
		this.tamanhoEmKb = tamanhoEmKb;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public double getTamanhoEmKb() {
		return tamanhoEmKb;
	}

	public void setTamanhoEmKb(double tamanhoEmKb) {
		this.tamanhoEmKb = tamanhoEmKb;
	}

	@Override
	public String toString() {
		return "ProdutoDigital  formato= " + formato + ", tamanhoEmKb= "
				+ tamanhoEmKb + ", id= " + id + ", descricao= " + descricao
				+ ", preco= " + preco + ",  " + categoria;
	}

	

}
