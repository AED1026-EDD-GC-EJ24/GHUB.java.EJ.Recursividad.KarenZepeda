package miPrincipal;

public class AppFibRecursivode40a50 {
    public static void menu(){
        System.out.println("*******************************");
        System.out.println("Optimizando Fibonacci Recursivo");
        System.out.println("*******************************");
        Performance p= new Performance();
        int desde = 40;
        int hasta = 50;
        double ant=0;
        for(int i = desde; i<=hasta;i++){
            p.start();
            double f= AppFibonacci.fibonacciRec(i);
            p.stop();
            System.out.print("f("+i+")="+f+","+p.getMillis()+"ms, "+" veces");
            if(ant>=0)
                System.out.println(" Incr = "+f/ant);
            else
                System.out.println();
            ant =f;
        }
    }
    
}