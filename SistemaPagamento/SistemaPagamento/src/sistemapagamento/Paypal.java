package sistemapagamento;

public class Paypal implements Pagamento {

    @Override
    public Boolean autorizarPagamento(String cpf, Integer numeroCartao, Double valorCompra) {
        System.out.println("....");
        return false;
    }

    @Override
    public void processarPagamento() {
        System.out.println("....");
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("....");
    }
    
    
    
}
