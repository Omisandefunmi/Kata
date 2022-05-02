package chapterSeven;

import java.util.Scanner;

public class DiaryMain {
    public static void main(String[] args) {
        runDiaryApp();
    }


    private static final Scanner scanner = new Scanner(System.in);
    private static  Diary diary;
    private static final String MENU =  """
                Press
                1 - To create an entry
                2 - To edit an entry
                3 - To find an entry
                4 - To change password
                5 - To delete an entry
                6 - To view all entries in Diary
                7 - To exit diary
                """;


    public static void runDiaryApp(){
        System.out.println("Create user name");
        String username = scanner.nextLine();

        System.out.println("Create password");
        String pin = scanner.nextLine();

        diary = new Diary(username, pin);

        System.out.println("\n".repeat(5));

        System.out.printf("""
                WELCOME ON BOARD, %s!!!
                
                The smallest pen is sharper than the smartest mind!
                
                Retain memories by penning them down in your digital diary today!
                """, username.toUpperCase());

        System.out.println("\n".repeat(3));
        sortChoice();
    }

    private static void printDiaryMenu(){
        System.out.println(MENU);
    }

    private static void sortChoice(){
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
                    System.out.println("Diary closed");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option!!!");
                    System.out.println("\n".repeat(3));
                    sortChoice();

            }
        }
    }




    private static void createEntry() {
        System.out.println("Enter your diary password");
        String pin = scanner.nextLine();

        System.out.println("Enter title for entry");
        String title = scanner.nextLine();

        System.out.println("Pen your thoughts");
        String body = scanner.nextLine();

        diary.write(title, body, pin);
        System.out.println("Entry created successfully with id "+ diary.getNoOfEntries()+" !!!");
        System.out.println("\n".repeat(3));
        sortChoice();

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
        sortChoice();
    }

    private static void searchEntryInDiary() {
        System.out.println("Enter your password");
        String pin = scanner.nextLine();

        System.out.println("What is the id of the entry your are searching for?");
        int entryID = scanner.nextInt();
        scanner.nextLine();

        System.out.println(diary.findEntryBy(entryID, pin));
        System.out.println("\n".repeat(3));
        sortChoice();
    }

    private static void resetPassword() {
        System.out.println("Enter old password");
        String oldPin = scanner.nextLine();

        System.out.println("Enter old password again");
        String oldPinRepeat = scanner.nextLine();

        if(oldPin.equals(oldPinRepeat)){
            if (diary.getPassword().equals(oldPin)){
                System.out.println("Enter new password");
                String newPin = scanner.nextLine();
                diary.setPassword(newPin);
                System.out.println("Password change successful");
            }
            else{
                System.out.println("Failed!!! Password provided doesnt match existing password");

            }
        }
        else{
            System.out.println("Password mismatch");
        }
        System.out.println("\n".repeat(3));
        sortChoice();
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
                diary.deleteEntryBy(entryId, pin);
                System.out.println("Entry "+entryId+ " deleted!!!");
                sortChoice();
                break;

            case 2:
                System.out.println("Enter entry ID");
                String title = scanner.nextLine();

                System.out.println("Enter password");
                pin = scanner.nextLine();
                diary.deleteEntryByTitle(title, pin);
                System.out.println("Entry "+title+ " deleted!!!");
                sortChoice();
                break;

            case 3:
                System.out.println("\n".repeat(2));
                sortChoice();
                break;

            default:
                System.out.println("You have selected the wrong option");
                deleteEntryInDiary();

        }
    }

    private static void viewEntries() {
        System.out.println(diary.getUserName().toUpperCase()+" DIARY");
        System.out.println("\n".repeat(2));
        diary.printDiary();
        System.out.println("\n".repeat(3));
        sortChoice();

    }


}
