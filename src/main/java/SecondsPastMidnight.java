import java.util.Scanner;
class SecondsPastMidnight{
   public static void main(String[] args){
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
       //Reads int from user
       int mySecond = scanner.nextInt();
       int myHour = 0;
       int myMinute = 0;
       //Your code goes here
       myHour = mySecond / 3600;
       myMinute = mySecond / 60;
       System.out.print( myHour + " " + myMinute);
       // closing the scanner object
       scanner.close();
   }
}