package clinicaveterinaria;

public class Cachorro extends Animal {
    String raca;
    boolean castrado;
    boolean domesticado;
    
    public Cachorro(){
        super.tipoAlimento = "Ração";
    }
    
    public void brincar(){
        System.out.println("Corre atrás do graveto");
    }
    
    public String alimentar(Passarinho comida) {
        return comida.nome;
        
    }
    
    
}
