import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int numGrades=sc.nextInt();
    double[] grades=new double[numGrades];
    double sum=0;
    for(int i=0;i<numGrades;i++){
        grades[i]=sc.nextDouble();
        sum+=grades[i];
    }
    double avg=sum/numGrades;
    System.out.printf("Avg grade:%.2f\n",avg);
    sc.close();
}
}