public class Principal {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();
        Pista pista = new Pista();

        pista.iniciarCorrida(carro);
        pista.iniciarCorrida(bicicleta);
    }
}