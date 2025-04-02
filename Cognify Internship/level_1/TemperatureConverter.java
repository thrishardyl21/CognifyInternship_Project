import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temp value:");
        double temp=sc.nextDouble();
        System.out.println("Enter the unit(C for Celsius,F for Fahrenheit):");
        char unit=sc.next().toUpperCase().charAt(0);
        if(unit=='C'){
            double fahrenheit=(temp*9/5)+32;
            System.out.printf("%.2f degree C is equal to %.2f degree F\n",temp,fahrenheit);
        }
        else if(unit=='F'){
            double celsius=(temp-32)*5/9;
            System.out.printf("%.2f degree F is equal to %.2f degree C\n",temp,celsius);
        }else{
            System.out.println("Invalid unit!Please enter C for celsius or F for fahrenheit.");
        }
        sc.close();
    }
}