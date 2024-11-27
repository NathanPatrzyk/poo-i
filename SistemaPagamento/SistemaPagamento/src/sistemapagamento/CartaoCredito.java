package sistemapagamento;

public class CartaoCredito implements Pagamento, Serasa {

    @Override
    public void processarPagamento() {
        System.out.println("Esta rotina salvar em banco o pagamento");
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Dispara um email ou notificação informando o pagamento");
    }

    @Override
    public Boolean autorizarPagamento(String cpf, Integer numeroCartao, Double valorCompra) {
        System.out.println("Esta rotina vai checar o limite e autorizar o pagamento");
        Double saldoAtual = 500.00;                
        
        if (saldoAtual >= valorCompra) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean consultaScore(String cpf) {
        return false;
    }
    
}
