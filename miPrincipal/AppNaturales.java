package miPrincipal;
import java.util.Scanner;
public class AppNaturales{
    public static void menu(){
        System.out.println("************************");
        System.out.println("    NUMEROS NATURALES   ");
        System.out.println("************************");
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.print("Proporciona numero: ");
        int n= scanner.nextInt();
        System.out.println("    Versión Iterativa   ");
        muestraNaturalesIte(n);
        System.out.println("    Versión Recursiva   ");
        muestraNaturalesRac(n);

    }
    public static void muestraNaturalesIte(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    public static void muestraNaturalesRac(int n){
        if(n>0)
            muestraNaturalesRac(n-1);
        System.out.println(n);
    }
}