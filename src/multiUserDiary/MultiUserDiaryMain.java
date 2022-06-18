package multiUserDiary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiUserDiaryMain {
    public static void main(String[] args) {

        runDiaryApp();
    }
    private static final Scanner scanner = new Scanner(System.in);
    private static User user;
    private static int numberOfUsers;
    private static final UserRepository userRepository = new UserRepository();
    private static MultiUserDiary diary;
    private static final String MENU =  """
                Press
                1 - To create an entry
                2 - To edit an entry
                3 - To find an entry
                4 - To change password
                5 - To delete an entry
                6 - To view all entries in Diary
                7 - To log out
                8 - To exit diary app
                """;


    public static void runDiaryApp(){
        signInSignUpOptions();
        startDiaryApp();
    }

    private static void startDiaryApp() {
        displayWelcomeMessage();
        operateDiary();
    }

    private static void displayWelcomeMessage() {
        System.out.println("\n".repeat(5));
        System.out.println(">".repeat(60));
        System.out.printf("""
                
                WELCOME ON BOARD, DEAR %s!!!
                
                The smallest pen is sharper than the smartest mind!
                
                Retain memories by penning them down in your digital diary today!
                
                """, user.getName().toUpperCase());
        System.out.println(">".repeat(60));

        System.out.println("\n".repeat(3));
    }


    private static void printDiaryMenu(){
        System.out.println(MENU);
    }

    private static void operateDiary(){
        printDiaryMenu();
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    createEntry();
                    break;
                case 2:
                    editEntryInDiary();
                    break;
                case 3:
                    searchEntryInDiary();
                    break;
                case 4:
                    resetPassword();
                    break;
                case 5:
                    deleteEntryInDiary();
                    break;
                case 6:
                    viewEntries();
                    break;
                case 7:
                    logOut();
                    break;
                case 8:
                    quit = true;
                    exitApp();
                default:
                    System.out.println("Invalid option!!!");
                    System.out.println("\n".repeat(3));
                    operateDiary();

            }
        }
    }

    private static void exitApp() {
        System.out.println("<".repeat(40));
        System.out.println("""
                    
                    THANKS FOR CHOOSING SEMICOLON DIARY APP
                
                                GOODBYE     
                            """);
        System.out.println("<".repeat(40));
        System.exit(0);
    }


    private static void createEntry() {
        System.out.println("Enter title for entry");
        String title = scanner.nextLine();

        System.out.println("Pen your thoughts");
        String body = scanner.nextLine();

        diary.write(title, body);
        System.out.println("Entry created successfully with id "+ diary.getNoOfEntries()+" !!!");
        System.out.println("\n".repeat(3));
        operateDiary();

    }

    private static void editEntryInDiary() {
        System.out.println("What is the id of the entry you wish to edit?");
        int entryID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Enter your username");
        String username = scanner.nextLine();

        System.out.println("Enter title for entry");
        String title = scanner.nextLine();

        System.out.println("Enter new content for entry");
        String body = scanner.nextLine();

        diary.editEntry(entryID, title, body, username, password);
        System.out.println("Edit successful!!!");
        System.out.println("\n".repeat(3));
        operateDiary();
    }

    private static void searchEntryInDiary() {
        System.out.println("Enter your password");
        String pin = scanner.nextLine();

        System.out.println("What is the id of the entry your are searching for?");
        int entryID = scanner.nextInt();
        scanner.nextLine();

        System.out.println(diary.findEntryById(entryID, pin));
        System.out.println("\n".repeat(3));
        operateDiary();
    }

    private static void resetPassword() {
        System.out.println("Enter old password");
        String oldPin = scanner.nextLine();

            if (user.getPassword().equals(oldPin)){
                System.out.println("Enter new password");
                String newPin = scanner.nextLine();
                System.out.println("Re-enter new password");
                String newPassword = scanner.nextLine();
                if(newPin.equals(newPassword)){ user.setPassword(newPin);
                System.out.println("Password change successful");}
                else {
                    System.out.println("""
                            
                            Password change UNSUCCESSFUL!!!
                            
                            New password don't match""");
                }
            }

            else{
                System.out.println("Failed!!! Password provided doesnt match existing password");

            }
        System.out.println("\n".repeat(3));
        operateDiary();
    }

    private static void deleteEntryInDiary() {
        System.out.println("""
                Find entry to delete by:
                1 - Entry's ID
                2 - Entry's title
                3 - Exit delete entry""");

        int deleteChoice = scanner.nextInt();
        scanner.nextLine();

        switch (deleteChoice){
            case 1:
                System.out.println("Enter entry ID");
                int entryId = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter password");
                String pin = scanner.nextLine();
                if(entryId <= numberOfUsers){
                diary.deleteEntryBy(entryId, pin);
               }
                else{
                    System.out.println("""
                            
                            Oops!!!
                            Entry ID does not exist
                            
                            Please check the entry ID and try again.
                            
                            Thank you!!
                            
                            """);
                }
                operateDiary();
                break;

            case 2:
                System.out.println("Enter entry ID");
                String title = scanner.nextLine();

                System.out.println("Enter password");
                pin = scanner.nextLine();
                diary.deleteEntryByTitle(title, pin);
                System.out.println("Entry "+title+ " deleted!!!");
                operateDiary();
                break;

            case 3:
                System.out.println("\n".repeat(2));
                operateDiary();
                break;

            default:
                System.out.println("You have entered an invalid option");
                deleteEntryInDiary();

        }
    }

    private static void viewEntries() {

        System.out.println(diary.getOwnerName().toUpperCase()+" DIARY");
        System.out.println("\n".repeat(2));
        System.out.println(diary.printDiary());
        System.out.println("\n".repeat(3));
        operateDiary();

    }

    private static void signInSignUpOptions(){
        System.out.println("=".repeat(45));
        System.out.println("    WELCOME TO SEMICOLON DIARY APP   ");
        System.out.println("=".repeat(45));
        System.out.println("""
                
                Press 1 to sign in if you already have an account
                Press 2 to sign up if you are new to the app
                Press 3 to exit app
                
                """);
        try {
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> signIn();
                case "2" -> signUp();
                case "3" -> exitApp();
                default -> {
                    System.out.println("Invalid input\n");
                    signInSignUpOptions();
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
            signInSignUpOptions();}
    }

    private static void signUp() {
        System.out.println("What is your name?");
        String username = scanner.nextLine();
        System.out.println("Create password");
        String password = scanner.nextLine();
        user = new User(username, password);
        assignUserId();
        userRepository.addUsers(user);
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.printf("""
                
                %s, your diary account creation is successful.
                
                Here are your log in details:
                
                - Your username is %s
                - Your user ID is %s
                
                """, user.getName().toUpperCase(), user.getName(), user.getUserId());
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        diary = user.getDiary();
        startDiaryApp();
    }

    private static void assignUserId() {
        numberOfUsers++;
        user.setUserId("SCD0"+numberOfUsers);
    }

    private static void signIn() {
        System.out.println("What is your username?");
        String username = scanner.nextLine();
        System.out.println("What is your user ID");
        String userId = scanner.nextLine();

        if(userRepository.checkIfUserExists(username, userId)){
            user = userRepository.fetchUserWith(userId);
            diary = user.getDiary();
            startDiaryApp();
        }
        else{
            System.out.println("User not found");
            promptToCreateAccount();
        }
    }

    private static void promptToCreateAccount() {
        System.out.println("Will you like to create an account? (Yes/No)");
        String response = scanner.nextLine();
        switch (response.toLowerCase()){
            case "yes":
                signUp();
                break;
            case "no":
                exitApp();
            default:
                System.out.println("Invalid option");
                promptToCreateAccount();
        }
    }

    private static void logOut(){
        System.out.println("Log out success!!!\n\n");
        signInSignUpOptions();
    }
}
