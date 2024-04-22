import java.io.*;
import java.util.*;

class Main{
public static void main(String[] args) throws FileNotFoundException {

          // Display home screen
          System.out.println("Welcome to Java Console Commands!");
          System.out.println("You can use one of the following commands:");
          System.out.println("- touch");
          System.out.println("- mkdir");
          System.out.println("- rm");
          System.out.println("- cd");
          System.out.println("- mv");
          System.out.println("- cp");
          System.out.println("- ls");
          System.out.println("- pwd");
          System.out.println("- chmod");
          System.out.println("- cat");
          System.out.println("Enter the command you want to use:");

          // Create Scanner object to read user input
          Scanner scanner = new Scanner(System.in);
          String command = scanner.nextLine().trim().toLowerCase(); // Read user input and trim whitespace

          // Check which command was entered and display appropriate message
        if (command.equals("touch")) {
            System.out.println("You have selected the 'touch' command.");
          CreateFilDir f1 = new CreateFilDir();
          f1.mkfil();
        } else if (command.equals("mkdir")) {
            System.out.println("You have selected the 'mkdir' command.");
        } else if (command.equals("rm")) {
            System.out.println("You have selected the 'rm' command.");
        } else if (command.equals("cd")) {
            System.out.println("You have selected the 'cd' command.");
        } else if (command.equals("mv")) {
            System.out.println("You have selected the 'mv' command.");
        } else if (command.equals("cp")) {
            System.out.println("You have selected the 'cp' command.");
        } else if (command.equals("ls")) {
            System.out.println("You have selected the 'ls' command.");
        } else if (command.equals("pwd")) {
            System.out.println("You have selected the 'pwd' command.");
        } else if (command.equals("chmod")) {
            System.out.println("You have selected the 'chmod' command.");
        } else if (command.equals("cat")) {
            System.out.println("You have selected the 'cat' command.");
        } else {
            System.out.println("Invalid command. Please enter one of the provided commands.");
        }

          // Close Scanner
          scanner.close();
      }
  }




