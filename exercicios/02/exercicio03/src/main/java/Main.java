public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("A11B22", 2010);
        veiculo.exibirDados();

        //veiculo.setPlaca("C33D44");
        //veiculo.setAno(2011);

        //System.out.println(veiculo.getPlaca());
        //System.out.println(veiculo.getAno());

        Onibus onibus = new Onibus("E55F66", 2012, 50);
        onibus.exibirDados();

        //onibus.setPlaca("G77H88");
        //onibus.setAno(2013);
        //onibus.setAssentos(50);

        //System.out.println(onibus.getPlaca());
        //System.out.println(onibus.getAno());
        //System.out.println(onibus.getAssentos());

        Caminhao caminhao = new Caminhao("H99I10", 2014, 6);
        caminhao.exibirDados();

        //caminhao.setPlaca("J11K12");
        //caminhao.setAno(2015);
        //caminhao.setEixos(6);

        //System.out.println(caminhao.getPlaca());
        //System.out.println(caminhao.getAno());
        //System.out.println(caminhao.getEixos());
    }
}
