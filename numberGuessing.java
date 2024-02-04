import java.util.Random;
import java.util.Scanner;

class numberGuessing
{
 private static int genrateRandomNumber(int high,int low)
 {
  
    Random random =new Random();     

    int number=random.nextInt(high - low + 1) + low;
    return number;
    
   
 }
 public static void main(String[] args) throws Exception
 {
  Scanner sc =new Scanner(System.in);

  System.out.println("\n\t\t\t\t****__Number Guessing Game__*****");
  
  System.out.println("Enter the Upper Bound(higher value) of the Guessing Number");
  int  upperBound=sc.nextInt();
  
  System.out.println("Enter the Lower Bound(Lower Value) of the Guessing Number");
  int lowerBound=sc.nextInt();
 
  if(upperBound-lowerBound==0 || lowerBound>upperBound)
  {
  System.out.println("Entered Wrong Format");
  System.exit(2);
  }
  
  int actualNo=genrateRandomNumber(upperBound,lowerBound);

  
  int entry =0;
  do
  {

   System.out.println("Guess the Number");
   int guessingNo=sc.nextInt();

   if(guessingNo < lowerBound || guessingNo> upperBound)
   {
    System.out.println("Guess Number above "+lowerBound+ " and Below "+ upperBound );
    entry++;
   }
   else if(guessingNo==actualNo)
   {
    System.out.println("You Guessed Correct Number");
    entry++;
   }
   else if(guessingNo!=actualNo)
   {
    System.out.println("Wrong Guessing,Try again");
    entry++;
   } 

  
  }while(entry<5);
   {
 	System.out.println("you tried more than 5 times,Start New");
   } 
  
  
 
 }
}