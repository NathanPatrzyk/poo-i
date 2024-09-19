package aula01;

public class Principal {
	public static void main(String[] args) {
		Cadeira cadeira1 = new Cadeira();
		cadeira1.setNumeroPes(4);
		cadeira1.setMaterial("Plástico");
		cadeira1.setTemBracoApoio(true);

		Cadeira cadeira2 = new Cadeira();
		cadeira2.setNumeroPes(5);
		cadeira2.setMaterial("Tecido");
		cadeira2.setTemBracoApoio(false);

		Cadeira cadeira3 = new Cadeira();
		cadeira3.setNumeroPes(10);
		cadeira3.setMaterial("Tecido");
		cadeira3.setTemBracoApoio(false);

		System.out.println(cadeira1);
		System.out.println(cadeira2);
		System.out.println(cadeira3);
	}
}
