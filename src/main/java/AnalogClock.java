import java.util.Scanner;
class AnalogClock{
   public static void main(String[] args){
       //Creates a new scanner for user input
       Scanner in = new Scanner(System.in);
       //Reads ints from user
       int myDegrees = in.nextInt();
       /*
        *  your code goes here
        */
       int myHour = myDegrees / 30;
       int myHourAngle = myHour * 30;
       int myMinutes = (myDegrees - myHourAngle) * 2;
       System.out.println(myMinutes * 6);
       // closing the scanner object
       in.close();
   }
}