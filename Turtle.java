import java.util.Scanner;

public class Turtle {

    static String cmd;
    Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		run();
	}
	public static void run() {
		
		while (true) {
			System.out.print("Action: ");
			String cmd = scan.nextLine().toLowerCase().trim();

			readUserCommand();

			switch (cmd) {
				case "move":
				move(5);
				break;

				case "turnRight":
				turnright();
				break;

				case "turnleft":
				turnleft();
				break;

				case "stop":
				return;
			}

		}
	}

	public static void move(int steps) {
		System.out.println("Turtle move: " + steps + "steps");
	}
	public static void turnRight() {
		System.out.println("turtle turn right");
	}
	public static void turnLeft() {
		Syste.out.println("turtle turn left");
	}

	public static void readUserCommand() {

		switch (cmd) {
			case "move":
			case "turnleft":
			case "turnright":
			case "stop":
			    return;
			default:
			   System.out.println("Invalid command: " + cmd);
               System.out.println
               cmd = scan.nextLine;
               
		}
	}
}
