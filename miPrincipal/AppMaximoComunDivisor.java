package miPrincipal;
import java.util.Scanner;
public class AppMaximoComunDivisor{
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("MAXIMO COMUN DIVISOR");
        System.out.println("********************");
        System.out.println("Ingrese num 1: ");
        int a= scanner.nextInt();
        System.out.println("Ingrese num 2: ");
        int b= scanner.nextInt();
        System.out.println("El maximo comun divisor es: "+ mcdIte(a, b));

    }
    //public static int mcdRec(){}
    public static int mcdIte(int a, int b) {
        int temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }
}