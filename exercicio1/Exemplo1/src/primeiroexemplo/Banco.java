package primeiroexemplo;

public class Banco {
    private String nome;
    private String cpf;
    private double saldo;

    public Banco() {
        this.nome = "sem nome";
        this.cpf = "sem cpf";
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}