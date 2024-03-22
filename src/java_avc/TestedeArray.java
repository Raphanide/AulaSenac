package java_avc;

public class TestedeArray {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;

        nota1 = 5.5;
        nota2 = 4.0;
        nota3 = 2.0;

        //Declaração do array ( usa o " [] " pra definir que é array)
        int notas[];

        // Construção do Array
        notas = new int[100];

        //declaração e construção na mesma linha
        int notas2[] = new int[100];

        //está faltando a inicialização
        //posso declarar, construir e inicializar na mesma linha
        int notas3[] = {5,6,7,8,9};

        boolean resultados[] = {true, false, true, false};

        String DiasdaSemana[] = {"seg", "ter", "qua", "qui", "sex", "sab", "dom"};

        System.out.println(notas[2]);
    }
}
