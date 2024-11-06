
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name");
        String name = scanner.nextLine();

        System.out.println(name + " please enter the year you were born?");
        int year = scanner.nextInt();

        System.out.println(name + " What month in " + year + " were you born in?");
        int month = scanner.nextInt();

        System.out.println(name + " what day in " + year + "/" + month + " were you born in?");
        int day = scanner.nextInt();


        Calendar currentCalender = Calendar.getInstance();

        Calendar userCalendar = Calendar.getInstance();


        userCalendar.set(Calendar.YEAR, year);
        userCalendar.set(Calendar.MONTH, month - 1);
        userCalendar.set(Calendar.DAY_OF_MONTH, day);


        int age = currentCalender.get(Calendar.YEAR) - userCalendar.get(Calendar.YEAR);


        System.out.println(currentCalender.get(Calendar.DAY_OF_YEAR));
        System.out.println(userCalendar.get(Calendar.DAY_OF_YEAR));

        if (currentCalender.get(Calendar.DAY_OF_YEAR) > userCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        System.out.println(name + "You are " + age + " years old today");


        scanner.close();
    }
}
