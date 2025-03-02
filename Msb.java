import java.util.Scanner;
public class Msb{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("Enter the number:");
        int num =s.nextInt();
        while (num>=10){
            num/=10;
        }
        System.err.println("MSB digit is:"+num);
    }
}