
package sistemapagamento;


public class SistemaPagamento {

   
    public static void main(String[] args) {
        CartaoCredito cartaoMasterCard  = new CartaoCredito();
        
        Boolean statusCompra = cartaoMasterCard.autorizarPagamento("123.123.123-20", 32132193, 600.00);
        
        System.out.println(statusCompra);
    }
    
}
