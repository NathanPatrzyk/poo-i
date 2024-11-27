package clinicaveterinaria;

public class Passarinho extends Animal {
    
    private boolean temCrista;
    private String tipoAlimentacao = "Alpiste";
    
    
    public void voar(){
        
    }
    
    
    public String getComida(){
        return this.tipoAlimentacao;
    }
    
    @Override
    public void alimentar(){
        System.out.println("O passarinho come " + this.tipoAlimentacao);
    }
   
    
    
}
