import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        int a=0,b =1;
        for (int i=0;i<d;i++){
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}