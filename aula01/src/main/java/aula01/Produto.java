package aula01;

public class Produto {
  private String nome;
  private double preco;
  private String material;
  private String cor;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "Produto [nome=" + nome + ", preco=" + preco + ", material=" + material + ", cor=" + cor + "]";
  }
}
