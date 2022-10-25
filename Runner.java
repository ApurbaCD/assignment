import java.util.Scanner;

public class Runner {

  public static void main(final String[] args) {
    clock myClock = new clock();
    System.out.println("My Time: " + myClock.getTime());

    Scanner scan = new Scanner(System.in);
    System.out.print("How many hours ahead is your timezone: ");
    int timeZone = scan.nextInt();
    scan.close();

    WorldClockc worldClock = new WorldClockc(timeZone);
    System.out.println("My Time + " + timeZone + ": " + worldClock.getTime());
  }
}
    
