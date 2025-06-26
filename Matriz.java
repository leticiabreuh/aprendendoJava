import java.util.Scanner;
public class Matriz{

    public static void main(String[] args){
        int [] [] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // for linha
        for(int i = 0; i < 3; i++){
            //for coluna
            for(int y=0; y < 3; y++){
                 // System.out.print(matriz[i][y]+"\t");
                  //System.out.print(matriz[i][y]+"\t|\t");
                  System.out.print(matriz[i][y]+"|");

            }


            System.out.print("\n - - -\n");
          
        }

        Scanner scanner = new Scanner(System.in);

    }
}