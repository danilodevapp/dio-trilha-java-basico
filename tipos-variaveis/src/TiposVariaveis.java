public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Trabalhando com variáveis em Java!");
        System.out.println("");

        double salarioMinimo = 2500.00;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        
        String nomeUM = "Danilo";
        String nomeDois =  "Estevão";

        boolean confirma = nomeUM == nomeDois;
        System.out.println("Confirma se nomes são iguais: " + confirma);

        int numero = 1;
        numero = 2;

        //O valor nunca poderá mudar quando a variável for declarada em "CAIXA ALTA".
        //Ex.:

        //Dessa mameira, ainda se premite alterar o valor
        //double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 3.10;

        //Para torná-la imutável usa-se o prefixo "final" antes da declaração, ex.:
        final double VALOR_DE_PI = 3.14;

    }
}
