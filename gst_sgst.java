import java.util.Scanner;
public class gst_sgst{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the amount:");
        double price =s.nextDouble();
        double cgst=price*0.09;
        double sgst=price*0.11;
        double tot=price+cgst+sgst;
        System.out.println("CGST:"+cgst);
        System.out.println("SGST:"+sgst);
        System.out.println("Total amount:"+tot);
    }
}