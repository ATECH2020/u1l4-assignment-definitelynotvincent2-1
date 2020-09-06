import java.util.Scanner;
class Timestamps{
   public static void main(String[] args){
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
       //Reads ints from user
       int hours1 = scanner.nextInt();
       int minutes1 = scanner.nextInt();
       int seconds1 = scanner.nextInt();
       int hours2 = scanner.nextInt();
       int minutes2 = scanner.nextInt();
       int seconds2 = scanner.nextInt();
       //Variables
       int myFHour;
       int myFMinute;
       int myFSecond;
       int myFinalAnswer;
       /*
        *  your code goes here
        */
       myFHour = hours2 - hours1;
       myFMinute = minutes2 - minutes1;
       myFSecond = seconds2 - seconds1;
       myFinalAnswer = (myFHour * 3600) + (myFMinute * 60) + myFSecond;
       //Print Statement
       System.out.println( myFinalAnswer);
       // closing the scanner object
       scanner.close();
   }
}