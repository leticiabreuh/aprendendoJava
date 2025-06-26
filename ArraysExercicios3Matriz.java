import java.util.Scanner;
public class ArraysExercicios3Matriz{

    public static void main(String[] args){

        String[] alunos = new String [5];
        double[] media = new double[5];
        double [] [] notas = new double[5][4];//Matriz5x4
         //  double notas = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome do aluno: "+(y+1)+" do aluno "+(i+1)+": ");
            alunos[i] = scanner.nextLine();

            soma=0;

            for(int y = 0; y < 4; y++){
              System.outprintln("Digite a nota "+(y+1)+" do aluno "+alunos[i]": ");
              notas[i][y] = scanner.nextDouble();
              soma = soma+notas[i][y];

            }
               scanner.nextLine();//limpar o buffer
               media[i] = notas /4;
            

            
        }
          System.out.println("Resultados: ");
          System.out.println("------------");


          //Mostra o nome, media e as notas de cada aluno
          for(int i=0; i<5; i++){
            System.out.println("Nome: "+alunos[i]+" - Media: "+media[i]);
          }

    }
}