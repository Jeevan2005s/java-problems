import java.util.Scanner;
public class calcu{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.err.println("The answer is "+(a+b)*c);
    }
}