 
 
//biblioteca Scanner 
import java.util.Scanner;

public class Input{
   
    //Saida de informação
    public static void main(String[] args){

     Scanner scanner =  new Scanner(System.in);//Instancia de uma classe (Classe -> Objeto)
    System.out.println("Digite o seu nome:");
    String  nome = scanner.nextLine();
    System.out.println("Nome: "+nome);

    System.out.println("Digite a sua idade: ");
    int  idade = scanner.nextInt();

     System.out.println("Seu nome e "+nome+" e voce tem "+idade+" anos");
    
/*
    System.out.println("Ola a todos");
    System.out.println("Muito frio");
    System.out.print("Pular linha");
    System.out.print("\nPular linha 2");
    */
}
}