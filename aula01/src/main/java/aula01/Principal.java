package aula01;

public class Principal {
	public static void main(String[] args) {
		Produto cadeira = new Produto();
		cadeira.setNome("Cadeira");
		cadeira.setPreco(89.99);
		cadeira.setMaterial("Metal");
		cadeira.setCor("Preto");

		Produto mesa = new Produto();
		mesa.setNome("Mesa");
		mesa.setPreco(119.99);
		mesa.setMaterial("Madeira");
		mesa.setCor("Marrom");

		Produto caneta = new Produto();
		caneta.setNome("Caneta");
		caneta.setPreco(9.99);
		caneta.setMaterial("Plástico");
		caneta.setCor("Azul");

		System.out.println("Produtos Cadastrados: \n");
		System.out.println(cadeira.toString());
		System.out.println(mesa.toString());
		System.out.println(caneta.toString());
		System.out.println("\n");

		Estoque estoqueCadeirasMatriz = new Estoque();
		estoqueCadeirasMatriz.setFilial("Matriz de Irati");
		estoqueCadeirasMatriz.setProduto(cadeira);
		estoqueCadeirasMatriz.aumentarQuantidade(10);
		estoqueCadeirasMatriz.diminuirQuantidade(5);

		Estoque estoqueCadeirasFilial = new Estoque();
		estoqueCadeirasFilial.setFilial("Filial de Rebouças");
		estoqueCadeirasFilial.setProduto(cadeira);
		estoqueCadeirasFilial.aumentarQuantidade(8);
		estoqueCadeirasFilial.diminuirQuantidade(2);

		Estoque estoqueMesasMatriz = new Estoque();
		estoqueMesasMatriz.setFilial("Matriz de Irati");
		estoqueMesasMatriz.setProduto(mesa);
		estoqueMesasMatriz.aumentarQuantidade(8);
		estoqueMesasMatriz.diminuirQuantidade(1);

		Estoque estoqueMesasFilial = new Estoque();
		estoqueMesasFilial.setFilial("Filial de Rebouças");
		estoqueMesasFilial.setProduto(mesa);
		estoqueMesasFilial.aumentarQuantidade(4);
		estoqueMesasFilial.diminuirQuantidade(3);

		Estoque estoqueCanetasMatriz = new Estoque();
		estoqueCanetasMatriz.setFilial("Matriz de Irati");
		estoqueCanetasMatriz.setProduto(caneta);
		estoqueCanetasMatriz.aumentarQuantidade(400);
		estoqueCanetasMatriz.diminuirQuantidade(125);

		Estoque estoqueCanetasFilial = new Estoque();
		estoqueCanetasFilial.setFilial("Filial de Rebouças");
		estoqueCanetasFilial.setProduto(caneta);
		estoqueCanetasFilial.aumentarQuantidade(200);
		estoqueCanetasFilial.diminuirQuantidade(40);

		System.out.println("Estoques Cadastrados: \n");
		System.out.println(estoqueCadeirasMatriz.toString());
		System.out.println(estoqueCadeirasFilial.toString());
		System.out.println(estoqueMesasMatriz.toString());
		System.out.println(estoqueMesasFilial.toString());
		System.out.println(estoqueCanetasMatriz.toString());
		System.out.println(estoqueCanetasFilial.toString());
		System.out.println("\n");
	}
}
