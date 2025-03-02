import java.util.Scanner;
public class sumof4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the four digit number:");
        int n=s.nextInt();
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        System.out.println("The sum of the four digit number is:"+sum);
    }
}