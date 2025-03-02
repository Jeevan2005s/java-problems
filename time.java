import java.util.Scanner;
public class time{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("Enter the number of days:");
        int days=s.nextInt();
        System.out.println("Hours:"+days*24);
        System.err.println("Minutes:"+(days*24)*60);
        System.err.println("Seconds:"+(days*24)*3600);
    }
}