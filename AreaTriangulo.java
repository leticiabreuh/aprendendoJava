import java.util.Scanner;
public class AreaTriangulo{
     public static void main(String[] args){
        double x1,x2, x3, y1, y2, y3, px, py, areax, areay;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado 1 do x: ");
        x1 = scanner.nextDouble();
        System.out.println("Digite o segundo lado 2 do x: ");
        x2 = scanner.nextDouble();
        System.out.println("Digite o terceiro lado 3 do x: ");
        x3 = scanner.nextDouble();

        System.out.println("Digite o primeiro lado 1 do y: ");
        y1 = scanner.nextDouble();
        System.out.println("Digite o segundo lado 2 do y: ");
        y2 = scanner.nextDouble();
        System.out.println("Digite o terceiro lado 3 do y: ");
        y3 = scanner.nextDouble();

        px =(x1+x2+x3)/2;
        py =(y1+y2+y3)/2;

        areax = Math.sqrt(px*(px-x1)*(px-x2)*(px-x3));
        areay = Math.sqrt(py*(py-y1)*(py-y2)*(py-y3));
      
         System.out.println("Triangulo X area: "+areax);
         System.out.println("Triangulo Y area: "+areay);

         if(areax >= areay){
            System.out.println("A area de X é maior.");
         }else{
            System.out.println("A area de Y é menor.");
         }
            

     }
}