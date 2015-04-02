public class Tester {

	public static void main(String[] args) {

		// add categorias

		Categoria digital = new Categoria("Jogos");
		Categoria analogico = new Categoria("Relogios");

		
		ProdutoAnalogico anal = new ProdutoAnalogico(1, "Rolex", 200, analogico,
				0.137, 2.2);
		System.out.println(anal.toString());

		ProdutoDigital digimon = new ProdutoDigital(2,"GTA V" ,150, digital,
				Formato.Bluray, 16.777216);
		System.out.println(digimon.toString());
		

	}

}
