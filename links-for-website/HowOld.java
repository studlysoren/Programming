//source code for how old

import java.util.Scanner;
import java.util.Calendar;

public class HowOld {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter Year of Birth");
    int year = keyboard.nextInt();
    System.out.println("Enter Month of Birth");
    int month = keyboard.nextInt();
    System.out.println("Enter Day of Birth");
    int day = keyboard.nextInt();
    System.out.println("Enter Hour of Birth");
    int hour = keyboard.nextInt();
    System.out.println("Enter Minute of Birth");
    int minute = keyboard.nextInt();
    System.out.println("Enter Second of Birth");
    int second = keyboard.nextInt();
    System.out.println("Enter Millisecond of Birth");
    int mil = keyboard.nextInt();

    Calendar now = Calendar.getInstance();
    int yearAge = (now.get(Calendar.YEAR)) - year;
    int monthAge = (now.get(Calendar.MONTH)) - month;
    int dayAge = (now.get(Calendar.DATE)) - day;
    int hourAge = (now.get(Calendar.HOUR)) - hour;
    int minuteAge = (now.get(Calendar.MINUTE)) - minute;
    int secondAge = (now.get(Calendar.SECOND)) - second;
    int milAge = (now.get(Calendar.MILLISECOND)) - mil;
    if(monthAge < 0){
      yearAge --;
      monthAge += 12;
    }
    if(dayAge <0){
      monthAge --;
      dayAge += 31;
    }
    if(hourAge <0){
      dayAge --;
      monthAge += 12;
    }
    if(minuteAge <0){
      hourAge --;
      minuteAge += 60;
    }
    if(secondAge <0){
      minuteAge --;
      secondAge += 60;
    }
    if(milAge <0){
      secondAge --;
      milAge += 1000;
    }  
    System.out.println(yearAge + " years " + monthAge + " months " + dayAge + " days " + hourAge + " hours " + minuteAge + " minutes " + secondAge + " seconds and " + milAge + " milliseconds ");   
  }
}
