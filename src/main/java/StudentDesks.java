import java.util.Scanner;
class StudentDesks{
   public static void main(String[] args){
       //Creates a new scanner for user input
       Scanner in = new Scanner(System.in);      
       //Reads ints from user
       int myA = in.nextInt();
       int myB = in.nextInt();
       int myC = in.nextInt();
       /*
        *  your code goes here
        */
       int myFinalAnswer = ((myA / 2) + (myA % 2)) + ((myB / 2) + (myB % 2)) + ((myC / 2) + (myC % 2));
       System.out.print(myFinalAnswer);
       // closing the scanner object
       in.close();
   }
}