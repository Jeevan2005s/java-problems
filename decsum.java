import java.util.Scanner;
public class decsum{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("Enter the two decimal numbers:");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=a+b;
        System.out.println("Fractional part:"+(c-(int)c));  
        }
}