public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void exibirDados() {
        System.out.println("Onibus = {");
        System.out.println("\tPlaca = "+ super.getPlaca());
        System.out.println("\tAno = "+super.getAno());
        System.out.println("\tAssentos = "+this.assentos);
        System.out.println("}");
    }
}
