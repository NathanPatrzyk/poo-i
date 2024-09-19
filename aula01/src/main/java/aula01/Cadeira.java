package aula01;

public class Cadeira {
	private int numeroPes;
	private String material;
	private boolean temBracoApoio;

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

	public boolean getTemBracoApoio() {
		return this.temBracoApoio;
	}

	public void setTemBracoApoio(boolean temBracoApoio) {
		this.temBracoApoio = temBracoApoio;
	}

	@Override
	public String toString() {
		return "Cadeira [\n  numeroPes=" + numeroPes + ",\n  material=" + material + ",\n  temBracoApoio=" + temBracoApoio
				+ "\n]\n";
	}
}
