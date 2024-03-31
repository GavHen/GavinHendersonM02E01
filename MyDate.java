package Module2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    // Data fields to store year, month, and day
    private int year;
    private int month;
    private int day;

    // No-arg constructor to create MyDate object for the current date
    public MyDate() {
        // Get the current date using GregorianCalendar
        GregorianCalendar currentDate = new GregorianCalendar();
        // Extract year, month, and day from the current date
        this.year = currentDate.get(Calendar.YEAR);
        this.month = currentDate.get(Calendar.MONTH);
        this.day = currentDate.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor that constructs a MyDate object with specified elapsed time
    public MyDate(long elapsedTime) {
        // Call the setDate method to set the date using elapsed time
        setDate(elapsedTime);
    }

    // Constructor that constructs a MyDate object with specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter method for the year
    public int getYear() {
        return year;
    }

    // Getter method for the month
    public int getMonth() {
        return month;
    }

    // Getter method for the day
    public int getDay() {
        return day;
    }

    // Method to set a new date for the object using elapsed time
    public void setDate(long elapsedTime) {
        // Create a GregorianCalendar object and set its time to the specified elapsed time
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        // Extract year, month, and day from the elapsed time
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Main method to test the MyDate class
    public static void main(String[] args) {
        // Create MyDate objects for current date and custom date
        MyDate currentDate = new MyDate();
        MyDate customDate = new MyDate(34355555133101L);

        // Print current date
        System.out.println("Current Date:");
        System.out.println("Year: " + currentDate.getYear() + ", Month: " + (currentDate.getMonth() + 1) + ", Day: " + currentDate.getDay());

        // Print custom date
        System.out.println("\nCustom Date:");
        System.out.println("Year: " + customDate.getYear() + ", Month: " + (customDate.getMonth() + 1) + ", Day: " + customDate.getDay());
    }
}
