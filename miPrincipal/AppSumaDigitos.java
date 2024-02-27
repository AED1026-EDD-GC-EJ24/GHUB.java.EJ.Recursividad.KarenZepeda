package miPrincipal;
import java.util.Scanner;
public class AppSumaDigitos{
    public static void menu(){
        System.out.println("********************");
        System.out.println("    SUMA DIGITOS    ");
        System.out.println("********************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proporciona número: ");
        int n= scanner.nextInt();
        System.out.println("Versión Iterativa");
        System.out.println("Resultado = "+sumaDigitosIte(n));
        System.out.println("Versión Recursiva");
        System.out.println("Resultado = "+sumaDigitosRec(n));
    }
    public static int sumaDigitosIte(int n){
        int suma= 0;
        while (n>9){
            suma = suma + n%10;
            n= n/10;
        }
        return (suma+n);
    }
    public static int sumaDigitosRec(int n){
        if(n<=9)
            return n;
        else
            return sumaDigitosRec(n/10)+n%10;
    }
}