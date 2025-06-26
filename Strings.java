public class Strings{

    public static void main(String[] args){

        String senha = "ABC123";

        if(senha.length() > 3){
            System.out.println("Senha valida");
        } else{
            System.out.println("Senha invalida. Tamanho: "+senha.length());
        }

        //Tamanho dos caracteres
        System.out.println("LowerCase: "+senha.toLowerCase());
         System.out.println("UpperCase: "+senha.toUpperCase());
         System.out.println("Normal Case: "+senha);

         //Localizar caracteres
          String texto = "Hoje e terca feira";
           System.out.println(texto.indexOf("terca"));

           //Contatenar
           String nome = "Leticia";
           String sobrenome = "Abreu";
           System.out.println(nome+""+sobrenome);
           System.out.println(nome.concat(" ").concat(sobrenome));

            System.out.println("Hoje esta fazendo \"calor\" e frio");
             System.out.println("Hoje esta fazendo \t\t\tcalor e frio");


    }
}