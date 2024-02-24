import java.util.Scanner;
public class Grader //class starts
{
    public static void main(String Args[])//main method starts
    {
        int total;//stores total marks obtained
        double average;//stores average marks scored
        Scanner sc = new Scanner(System.in);//scanner object sc initialised 
        
        //user input is accepted
        System.out.print("Enter total marks: ");
        total = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        average = total/sc.nextInt();
        
        //grading algorithm 
        if(average<40)
        System.out.println("Fail");
        else if(average>=40 && average<=60)
        System.out.println("D");
        else if(average>60 && average<=75)
        System.out.println("C");
        else if(average>75 && average<=80)
        System.out.println("B");
        else if(average>80 && average<=90)
        System.out.println("A");
        else
        System.out.println("A+");
        
        sc.close();//close scanner object sc
    }    
}
