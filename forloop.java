import java.util.Scanner;
public class forloop{
    public static void main(String[] args) {
        // int[] a={1,2,3,4,5};
        Scanner s=new Scanner(System.in);
        String name = s.nextLine();
        String[] a=name.split(" ");
        for (String f:a){
            int y = Integer.parseInt(f);
            if(y%2==0){
                System.out.println(f);
             }
        }
    }
}