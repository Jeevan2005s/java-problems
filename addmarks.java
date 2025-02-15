import java.util.Scanner;
public class addmarks{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter marks separated with comma");
        String marks= s.next();
        String[] j=marks.split(",");
        int p=0;
        for(String a:j){
            int d=Integer.parseInt(a);
            p=p+d;
        }
        System.out.println(p);

    }
}