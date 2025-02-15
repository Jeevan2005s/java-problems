import java.util.Scanner;
public class factorial{
    static int fact(int  n){
        return(n==0)?1:n*fact(n-1);
    }
    public static void main(String[] args) {
       Scanner l=new Scanner(System.in);
       int n=l.nextInt();
       System.err.println(fact(n));
    }
}