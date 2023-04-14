/**
 * Accepts a command-line argument representing a user's name, and then prints it on the console.
 */

public class PassParameter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java UserInfo <username>");
            System.exit(1);
        }

        String name = args[0];
        System.out.println("your name is: " + name);
    }
}