import java.util.Scanner;
class StudentDesks{
   public static void main(String[] args){
       //Creates a new scanner for user input
       Scanner in = new Scanner(System.in);      
       //Reads ints from user
       int myA = (in.nextInt() / 2);
       int myB = (in.nextInt() / 2);
       int myC = (in.nextInt() / 2);
       /*
        *  your code goes here
        */
       int myRemainder = (myA + myB + myC) % 2;
       int myFinalAnswer = myA + myB + myC + myRemainder;
       System.out.print(myFinalAnswer);
       // closing the scanner object
       in.close();
   }
}