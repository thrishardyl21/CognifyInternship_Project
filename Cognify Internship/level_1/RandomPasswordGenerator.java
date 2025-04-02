import java.security.SecureRandom;
import java.util.Scanner;
public class RandomPasswordGenerator{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    SecureRandom random=new SecureRandom();
    System.out.print("Enter password length");
    int length=sc.nextInt();
    System.out.print("Include numbers?(true/false):");
    boolean useNumbers=sc.nextBoolean();
    System.out.print("Include lowercase letters?(true/false):");
    boolean useLower=sc.nextBoolean();
    System.out.print("Include uppercase letters?(true/false):");
    boolean useUpper=sc.nextBoolean();
    System.out.print("Include special characters?(true/false):");
    boolean useSpecial=sc.nextBoolean();
    String charPool=" ";
    if (useNumbers) charPool+="0123456789";
    if(useLower) charPool+="abcdefghijklmnopqrstuvwxyz";
    if(useUpper) charPool+="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    if(useSpecial) charPool+="!@#$%^&*()-_=+<>?";
    if(charPool.isEmpty()){
        System.out.print("Please select atleast one character");
        return;
    }
    StringBuilder password=new StringBuilder();
    for(int i=0;i<length;i++){
        password.append(charPool.charAt(random.nextInt(charPool.length())));
    }
    System.out.println("Generated password:"+password);
    sc.close();
}


}