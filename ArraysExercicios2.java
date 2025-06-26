import java.util.Scanner;
public class ArraysExercicios2{

    public static void main(String[] args){

        String[] alunos = new String [5];
        double[] media = new double[5];
         //  double notas = 0;

        Scanner scanner = new Scanner(System.in);

        for(int y=0; y<5; y++){
            System.out.println("Digite o nome do aluno: "+(y+1)+" do aluno "+(i+1)+": ");
            notas = notas + scanner.nextDouble();

               scanner.nextLine();//limpar o buffer


            System.out.println("Digite a nota 1: ");
            notas = notas + scanner.nextDouble();
            
            media[i] = notas /4;

            
        }
          System.out.println("Resultados: ");
          System.out.println("------------");

          for(int i=0; i<5; i++){
            System.out.println("Nome: "+alunos[i]+" - Media: "+media[i]);
          }

    }
}