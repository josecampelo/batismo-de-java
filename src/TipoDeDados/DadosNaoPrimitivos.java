package TipoDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
            Dados nao primitivos: String, Array, Class, enum
            Objetivo da aula: Criar um ninja e atribuir metodos a ele
         */

        // Declarando a variavel como Naruto Uzumaki
        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase();
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeToUpperCase);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaToLowerCase = aldeia.toLowerCase();

        System.out.println("Esse texto esta em Caixa Baixa: " + aldeiaToLowerCase);
        System.out.println("Esse texto esta normal: " + aldeia);
    }
}