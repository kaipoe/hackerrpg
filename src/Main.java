package src;

import java.util.Scanner;


public class Main {

    public static String username;
    public static void main(String[] args) {
        GenerateName generator = new GenerateName();
        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        System.out.println("So you want to become an elite hacker? Let's see if you've got what it takes.");
        System.out.println("First, tell me your name: ");
        System.out.println("(1) Enter name\n(2) Generate a cool hacker name for me\n(3) Exit");
        int nameResponse = scan.nextInt();
        scan.nextLine();
            switch (nameResponse) {
                case 1:
                    System.out.print("Username: ");
                    username = scan.nextLine();
                    System.out.println("Okay " + username + ", let's get started.");
                    break;
                case 2:
                    System.out.println("Generating...");
                    username = generator.generateName();
                    System.out.println("Your cool hacker name is " + username + ".");
                    System.out.println("Keep?\n(1) Yes\n(2) No");
                    int nameKeep = scan.nextInt();
                        while (nameKeep != 1) {
                            username = generator.generateName();
                            System.out.println("Your cool hacker name is " + username + ".");
                            System.out.println("Keep?\n(1) Yes\n(2) No");
                            nameKeep = scan.nextInt();
                        }
                        System.out.println("Username set to " + username + ".");

                    break;
                case 3:
                    System.out.println("Thanks for playing!");
                    System.exit(0);

            }

            }
    }
