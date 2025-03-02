import java.util.Scanner;
public class unitdigit{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        System.out.println("Unit Digit:"+num%10);
    }
}