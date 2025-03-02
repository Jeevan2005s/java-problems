
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class agefinder{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter yout birth date:");
        int day=s.nextInt();
        System.out.println("Enter yout birth month:");
        int mon=s.nextInt();        
        System.out.println("Enter yout birth year:");
        int year=s.nextInt();
        LocalDate birthDate =LocalDate.of(year,mon,day);
        LocalDate CurrentDate = LocalDate.now();
        Period age=Period.between(birthDate, CurrentDate);
        System.err.println("Your age is:"+age.getYears());
    }
}