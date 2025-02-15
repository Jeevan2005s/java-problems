import java.util.Scanner;


public class first {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String[] v =name.split(" ");
        System.err.println(v.length);
        for( String i : v){
            System.err.println(i);
        }
        // System.out.println(" hiiii");
        // System.out.println(name);
    }
}