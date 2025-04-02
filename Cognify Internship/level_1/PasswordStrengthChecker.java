import java.util.Scanner;
public class PasswordStrengthChecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a password:");
        String password=sc.nextLine().trim();
        int score=0;
        if(password.length()>=8) score++;
        if(password.matches(".*[A-Z].*")) score++;
        if(password.matches(".*[a-z].*")) score++;
        if(password.matches(".*\\d.*")) score++;
        if(password.matches(".*[!@#$%^&*()_+\\-=\\'<>\\[\\]{}|;:,./?].*")) score++;
        System.out.println("Password strength:");
        switch(score){
            case 5-> System.out.println("Very Strong");
            case 4-> System.out.println(" Strong");
            case 3-> System.out.println("Moderate");
            case 2-> System.out.println("weak");
            default-> System.out.println("Very weak");
        }
        sc.close();
        

    }
}