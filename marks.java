import java.util.Scanner;
public class marks{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Tamil marks");
        int tam=s.nextInt();
        System.out.println("Enter your English marks");
        int eng=s.nextInt();   
        System.out.println("Enter your Maths marks");
        int mat=s.nextInt();        
        System.out.println("Enter your Science marks");
        int sci=s.nextInt();        
        System.out.println("Enter your Social Science marks");
        int soc=s.nextInt();
        System.out.println("Aggregate marks out of 500 is:"+(tam+eng+mat+sci+soc));
        System.out.println("Percentage of marks is:"+((tam+eng+mat+sci+soc)/5));

    }
}
