import java.util.Random;
import java.util.Scanner;

class numberGuessing
{
 private static int genrateRandomNumber(int high,int low)
 {
  
    Random random =new Random();     
   //random function generate random number based high - low and adding 1 for limit+1 also adding low to the random number for make sure the lower bound of the number 
    int number=random.nextInt(high - low + 1)+low ;
    return number;
    
   
 }
 public static void main(String[] args) throws Exception
 {
  Scanner sc =new Scanner(System.in);

  System.out.println("\n\t\t\t\t****__Number Guessing Game__*****");
  System.out.println("Only 8 attempts will be Provided to find the Number.");
  System.out.println("Try to Guess less than 8 attempt");
  
  System.out.println("Enter the Upper Bound(higher value) of the Guessing Number");
  int  upperBound=sc.nextInt();
  
  System.out.println("Enter the Lower Bound(Lower Value) of the Guessing Number");
  int lowerBound=sc.nextInt();
 
 //both upper and lower bound cannot be same and lowerbound cannot be greater than upperbound
  if(upperBound-lowerBound==0 || lowerBound>upperBound)
  {
  System.out.println("Entered Wrong Format");
  System.exit(2);
  }
  
 //generating random number based on the criteria of the user
  int actualNo=genrateRandomNumber(upperBound,lowerBound);

  int guessingNo,above,a,below,b;
  int entry =1;

   a=5;
   b=10;

   above= actualNo - a;
   below=  actualNo + b;   
 
  do
  {

   System.out.println("Guess the Number");
   guessingNo=sc.nextInt();

   if(guessingNo < lowerBound || guessingNo> upperBound)
   {
    System.out.println("Guess Number above "+lowerBound+ " and Below "+ upperBound );
    entry++;
   }
   else if(guessingNo==actualNo)
   {
    System.out.println("You Guessed Correct Number");
    entry++;
     break;
   }
   else if(guessingNo!=actualNo)
   {
   
  
    System.out.println("Try above" + above+"and Below" + below);
    System.out.println("Wrong Guessing,Try again");
    entry++;
   } 
   above++;
   below--;
  
  }while(entry<=8 );

   if(entry>=5)
  {
 	System.out.println("you tried more than 5 times,Start New");
	System.out.println("The Number  is" + actualNo);
   } 
  
  
 
 }
}