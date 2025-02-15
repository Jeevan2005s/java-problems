import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        int f=d;
        int r=0;
        while(d>0){
            int t=d%10;
            d=d/10;
            r=r*10+t;
        }
        if (f==r){
            System.out.println("It is Palindrome");
        }else {
            System.out.println("It is not a Palindrome");
        }
        }

    }
