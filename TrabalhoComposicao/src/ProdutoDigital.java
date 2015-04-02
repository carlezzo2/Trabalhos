public class ProdutoDigital {

	private Formato formato;
	private double tamanhoEmKb;
	private Produto produto;

	public ProdutoDigital(double tamanhoEmKb, Produto produto) {
		
		this.tamanhoEmKb = tamanhoEmKb;
		this.produto = produto;
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

	public Produto getProduto() {
		return produto;
	}
	
	@Override
	public String toString() {
		return "ProdutoDigital formato= " + formato + ", tamanhoEmKb= "
				+ tamanhoEmKb + ", " + produto;
	}

}
