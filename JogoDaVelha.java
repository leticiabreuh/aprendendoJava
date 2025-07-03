public class JogoDaVelha{

    public static void imprimirTabuleiro(char[] [] tabuleiro){
        for(int linha = 0; linha<3;linha++){
            for(int coluna=0; coluna<2; coluna++){
                System.out.print("\t"+tabuleiro[linha][coluna]);
                if(coluna<2){
                    System.out.print("\t|");
                }
            }
            System.out.println();
            if(linha<2){
                System.out.println("-------------------------------------------------------");

            }
            System.out.println();

        }
    }

    public static void main(String[] args){
        char [][] matriz ={
        {' ', ' ',' '},
        {' ',' ',' '},
        {' ',' ',' '},
    };


        System.out.println("### JOGO DA VELHA ###");
        imprimirTabuleiro(matriz);

        //repetição

        

    }
}