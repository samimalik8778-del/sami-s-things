package student;

import java.util.Scanner;
public class Student {

public static void main(String[] args) {
int quiz,assignment,midterm,finalmarks;
Scanner S=new Scanner(System.in);

        System.out.print("Enter Quiz marks out of 15: ");
        quiz = S.nextInt();

        System.out.print("Enter Assignment marks out of 10: ");
        assignment= S.nextInt();

        System.out.print("Enter Mid-Term marks out of 25: ");
        midterm = S.nextInt();

        System.out.print("Enter Final Exam marks out of 50): ");
        finalmarks = S.nextInt();
        
         int totalMarks;
         float average; 
        totalMarks=quiz+assignment+midterm+finalmarks;
         average=(float)totalMarks/100*100;
         
         System.out.println("Total Marks="+totalMarks);
         System.out.println("Average="+average);
         
         if(average>=85)
         {
             System.out.println("Grade A");
         }
         else if(average<85&&average>=70)
         {
             System.out.println("Grade B");
         }
         else if(average<70&&average>=50)
         {
             System.out.println("Grade C");
         }
         else if(average<50)
         {
             System.out.println("Fail");
         }
    } 
}
