package aula01;

public class Estoque {
  private Produto produto;
  private String filial;
  private int quantidade = 0;

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public String getFilial() {
    return filial;
  }

  public void setFilial(String filial) {
    this.filial = filial;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void aumentarQuantidade(int quantidade) {
    this.quantidade = this.quantidade + quantidade;
  }

  public void diminuirQuantidade(int quantidade) {
    this.quantidade = this.quantidade - quantidade;
  }

  @Override
  public String toString() {
    return "Estoque [produto=" + produto + " , filial=" + filial + " , quantidade=" + quantidade + "]";
  }

}
