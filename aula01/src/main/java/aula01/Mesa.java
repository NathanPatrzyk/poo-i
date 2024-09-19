package aula01;

public class Mesa {
	private int numeroPes;
	private String material;
	private String cor;
	private double preco;

	public int getNumeroPes() {
		return this.numeroPes;
	}

	public void setNumeroPes(int numeroPes) {
		this.numeroPes = numeroPes;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Mesa [\n  numeroPes=" + numeroPes + ",\n  material=" + material + ",\n  cor=" + cor + ",\n  preco=" + preco
				+ "\n]\n";
	}
}
