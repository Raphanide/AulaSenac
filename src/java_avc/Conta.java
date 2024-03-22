package java_avc;

public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;

    void sacar(double valor) {
        double saldoAlterado = saldo - valor;
        saldo = saldoAlterado;
    }

    void depositar(double valor) {
        this.saldo = this.saldo +valor;
//        this.saldo += valor; ( método mais rápido, porém menos legível)
    }
}
