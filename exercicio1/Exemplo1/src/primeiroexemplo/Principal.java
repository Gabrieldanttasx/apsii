package primeiroexemplo;

public class Principal {
    public static void main(String[] args) {
        Banco b3 = new Banco();

        b3.setNome("Matteo");
        System.out.println(b3.getNome());

        b3.setNome("Gabriel");
        System.out.println(b3.getNome());
    }
}