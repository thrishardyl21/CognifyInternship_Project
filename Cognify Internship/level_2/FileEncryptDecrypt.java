import java.io.*;
import java.util.*;
import java.util.Scanner;
public class FileEncryptDecrypt{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'E' to encrypt or 'D' to decrypt:");
        char choice=sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter file name:");
        String fileName=sc.nextLine();
        System.out.print("Enter output file name:");
        String outputFile=sc.nextLine();
        try{
        processFile(fileName,outputFile,choice=='E'|| choice=='e'?3:-3);
        System.out.println("Operation completed.");
        } catch (IOException e){
            System.out.println("Error processing file:"+e.getMessage());
        }
        sc.close();
        

    }
    private static void processFile(String inputFile,String outputFile,int shift) throws IOException {
        try (BufferedReader reader=new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile))) {
            int c;
            while((c=reader.read())!=-1){
                writer.write(c+shift);
            }
        }
    } 
}