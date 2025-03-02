import java.util.Scanner;
public class rangesum{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=s.nextInt();
        System.err.println("Enter the second numner:");
        int b=s.nextInt();
        System.out.println("Sum of the range of the number is:"+((b*(b+1)/2)-((a-1)*a/2)));    
        }
}