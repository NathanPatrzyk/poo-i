package sistemapagamento;

public interface Pagamento {
    
    public Boolean autorizarPagamento(String cpf, Integer numeroCartao, Double valorCompra);    
    public void processarPagamento();    
    public void confirmarPagamento();
}
