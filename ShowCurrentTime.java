import java.util.Scanner;
public class ShowCurrentTime {
	public static void main(String[] args){

		long milliseconds = System.currentTimeMillis();

		long totalSeconds = milliseconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = totalHours % 24 + 6L;

		long totalDay = totalHours / 24;

		double currentDay = totalDay % 30.4375;

		double totalMonth = totalDay / 30.4375;

		double currentMonth = totalMonth % 12;

		double totalYears = totalMonth / 12;


		System.out.printf("Current time is Year %f Month %0.f Day %0.f %d:%d:%d%n",currentYears + 1970, currentMonth, currentDay, currentHour, currentMinutes, currentSecond);
	}
}
