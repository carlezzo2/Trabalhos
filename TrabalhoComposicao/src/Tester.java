public class Tester {

	public static void main(String[] args) {

		// add categorias

		Categoria cat1 = new Categoria("Celulares");
		Categoria cat2 = new Categoria("Relogios");

		// add produtos 1 digital e um analogico
		Produto p1 = new Produto(1, "iphone", 3000, cat1);
		Produto p2 = new Produto(2, "Rolex", 1.99, cat2);

		// System.out.println(p1.toString());

		ProdutoAnalogico anal = new ProdutoAnalogico(0.137, 2.2, p2);
		System.out.println(anal.toString());

		ProdutoDigital digimon = new ProdutoDigital(1024, p1);
		digimon.setFormato(Formato.Mkv);
		System.out.println(digimon.toString());

	}

}
