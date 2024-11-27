package sistemapagamento;

public class TransferenciaBancaria implements Pagamento {

    @Override
    public Boolean autorizarPagamento(String cpf, Integer numeroCartao, Double valorCompra) {
        System.out.println("Rotina que autoriza o pagamento pela Transferencia Bancária");
        return true;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Atualizar o saldo em conta");        
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Comunica o cliente do pagamento");        
    }
    
}
