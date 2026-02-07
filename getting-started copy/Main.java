import java.util.ArrayList;

public class Main {

    // necessario colocar essa classe. mais pra frente entenderá o por quê
    public static void main(String[] args) {
        // declarando variavel

        // <tipo da variavel> <nome> <valor>
        int minhaIdade = 20;

        minhaIdade = 21;

        // quando eu chamo var, ele infere o tipo
        var novaIdade = 23;

//        // numeros inteiros
//        byte => 8 bits
//        short => 16 bits
//        int => 32 bits
//        long => 64 bits
//
//        // numeros decimais
//        float => 32 bits
//        double => 64 bits maior prciosão = mais casas decimais
//
//        string => palavras
//        char => unico caractere
//        boolean => true, false



        byte b = 100;
        short s = 10000;
        int in = 1000000;
        long l = 100000L; // precisa ter o L no final
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Davidson";
        boolean bool = true;

        if(b > 101) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if(str.equals("Davidson")) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        int[] colecaoDeInteiros = {1, 2, 3, 4};

        System.out.println(colecaoDeInteiros[0]);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Davidson");
        nomes.add("Fernanda");

        System.out.println(nomes);
        System.out.println(nomes.get(0));

        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        int count = 0;
        while(count < 10) {
            System.out.println("Estou no while");
            count ++;
        }

        // casting => mudança de tipo
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);
        
        String minhaString = String.valueOf(meuInt2);
    }

}
