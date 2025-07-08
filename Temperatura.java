import java.util.Scanner;
public class Temperatura{
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta","Sábbado"};
        double soma=0; media=0; maior=0; menor=0;
        
        for(int i=0; i<=7;i++){
            System.out.println("Digite a temperatura do dia"+(i+1));
             temperatura[i]= scanner.nextDouble();
        }

        soma+=temperatura[i];

        if(i==0){
          maior = temperatura[i];
          menor = emperatura[i];

        }else{
          if(maior<temperatura[i]){
            maior = temperatura[i];
          }
      
         }
         media = soma/7;

         System.out.println("A temperatura media da semana e: "+media);
          System.out.println("A maior temperatura e: "+maior);
           System.out.println("A menor temperatura e: "+menor);
       


  }
}