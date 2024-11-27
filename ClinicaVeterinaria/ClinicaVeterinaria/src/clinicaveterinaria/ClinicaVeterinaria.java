package clinicaveterinaria;

public class ClinicaVeterinaria {

    
    public static void main(String[] args) {
        
        Cachorro cao1 = new Cachorro();
        
        cao1.castrado = false;
        cao1.domesticado = true;
        cao1.cor = "Caramelo";
        cao1.dataNascimento = "01/01/2020";
        cao1.peso = 5;
        cao1.nome = "Domenica";
        cao1.numPatas = 4;
        
        Passarinho passaro1 = new Passarinho();
        passaro1.nome = "PiuPiu";
        
        
        //System.out.println("O " + cao1.alimentar(passaro1) + " foi engolido pela "+cao1.nome + " mas escapou igual a historia da baleia");        
        //System.out.println("Pássaros comem: " + passaro1.getComida());
        
        passaro1.alimentar();
        
    }
    
}
