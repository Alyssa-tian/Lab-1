public class TaylorSeries {

    //function pow, calculates x^n recursively
    public static double pow (int x, int n){
        if (n < 1) 
            return 1; 
        else
            return x * pow(x, n-1) ;    
    }

    //function factorial, calculates n! recursively
    public static long factorial (int n){
        if (n >= 1)
            return n * factorial(n - 1);
        else
            return 1;
    }
    
    public static double approximateExp (int x, int iterations){
        double result = 0.0;

        for (int i=0; i<iterations;i++){
            int n = i;
            double term = pow (x, n) / factorial (n);

            result+=term;
            
        }

        double val = Double.valueOf(result);
        result = Math.floor(val * 1e5) / 1e5;

        return result;
    }

    public static void main (String[] args){
        System.out.println(pow(3,4));
        System.out.println(approximateExp(2, 10));
    }
}