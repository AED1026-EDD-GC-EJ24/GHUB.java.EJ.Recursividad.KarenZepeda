package miPrincipal;
import java.util.Hashtable;
import java.util.Scanner;

public class AppFibonacci {
    private static long cont;

    public static void menu(){
        System.out.println("**************************");
        System.out.println("    Serie de fibonacci    ");
        System.out.println("**************************");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int n = entrada.nextInt();
        double f = fibonacciIte(n);
        
    }
    static double fibonacciIte(int n){
        double f=1,r1=1,r2=1;
        for(int i =3; i<=n;i++){
            f=r1+r2;
            r1=r2;
            r2=f;
        }
        return f;
    }
    static double fibonacciRec(int n){
        cont ++;
        double f;
        if(n<=2){
            f =1;
        }else{
            f= fibonacciRec(n-1)+fibonacciRec(n-2);
        }
    }
    static long setContador(){
        return cont;
    }
    static double fibonacciRecOptimizado(int x, Hashtable<Integer,Double>t){
        Double d = t.get(x);
        if(d==null){
            d=fibonacciRecOptimizado(x-1,t)+fibonacciRecOptimizado(x-2,t);
            t.put(x,d);
        }
        return d;
    }
}