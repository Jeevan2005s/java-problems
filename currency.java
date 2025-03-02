import java.util.Scanner;
public class currency{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of notes in 100's:");
        int hun=s.nextInt();
        System.out.println("Enter the number of notes in 500's:");
        int fiv=s.nextInt();
        System.out.println("Enter the number of notes in 1000's:");
        int tho=s.nextInt();
        System.out.println("The total amount is:"+(100*hun+500*fiv+1000*tho));
        }

    }