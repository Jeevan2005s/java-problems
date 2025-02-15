import java.util.Scanner;
public class armstrong{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int f=s.nextInt();
        int g=f,d=0,power=String.valueOf(f).length();
        while(f>0){
            int h=f%10;
            d+=Math.pow(h,power);
            f/=10;
        }
        if(d==g){
            System.out.println("It is an Armstrong number");
        }else{
            System.out.println("It is not a Armstrong number");
        } 
    }
}