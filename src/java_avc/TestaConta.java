package java_avc;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1; //declarei o objetivo c1 do tipo classe Conta.
        c1 = new Conta();  //Construção ou instanciação
//        Conta c1 = new Conta(); // declaração e instaciação na mesma linha

//        falta inicialização
        c1.numero = 001;
        c1.nome = "Rapha";
        c1.saldo = 100.0;
        c1.limite = 10.0;

        System.out.println("Número da conta "+c1.numero);
        System.out.println("Titular: "+c1.nome);
        System.out.println("Saldo atual: "+c1.saldo);
        System.out.println("limite: "+c1.limite);
    }
}
