package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservationSystem {

    public static void main(String[] args) {

            printHeader();
            serveChosenTicketType();
            displayArrayElement();

            }


    public static boolean [] seats = new boolean[10];
    public static Scanner scanner = new Scanner(System.in);
    public static int ticketType;
    private static int countA;
    private static int countB = 5;





    public static void printHeader(){


        System.out.println(welcomeAddress);


    }
    public static void displayArrayElement() {
        System.out.println(Arrays.toString(seats));
    }

    public static void serveChosenTicketType(){
        ticketType = scanner.nextInt();


            switch (ticketType) {
                case 1 -> serveFirstClassTicket();
                case 2 -> serveEconomyTicket();
                default -> {
                    System.out.println("Invalid entry!!!");
                    printHeader();
                    serveChosenTicketType();
                }
            }
    }

    private static void serveFirstClassTicket() {
        if (countA >= 0 && countA < 5) {

            seats[countA] = true;

            System.out.println("Your first class ticket has been successfully booked. Your seat number is " + (countA + 1));
            System.out.println("WISHING YOU A PLEASANT SKY EXPERIENCE!!!");
            System.out.println(SPACE);
            countA++;
            printHeader();
            serveChosenTicketType();
        }

        else
            redirectToEconomy();

    }
        private static void serveEconomyTicket(){


            if (countB <= 9){
                seats [countB] = true;
                System.out.println("Your economy ticket has been successfully booked. Your seat number is "+(countB+1));
                System.out.println("WISHING YOU A PLEASANT SKY EXPERIENCE!!!");
                System.out.println(SPACE);
                countB++;
                printHeader();
                serveChosenTicketType();
            }
            else
                redirectToFirstClass();
        }

        private static void redirectToEconomy(){

            String redirectToEconomyMessage =("""
                                                Oops!!! First class seats are all taken.
                                                Will you like to buy an Economy ticket?
                                                                    
                                                If YES, press 1
                                                If NO, press 2
                                                                    
                                                 """);

                System.out.println(redirectToEconomyMessage);
                int redirectChoice = scanner.nextInt();
            switch (redirectChoice) {
                case 1 -> serveEconomyTicket();
                case 2 -> System.out.println(THANK_YOU_MESSAGE);
                default -> {
                    System.out.printf("Invalid option!!!%s", SPACE);
                    redirectToEconomy();
                }
            }
            }



    private static void redirectToFirstClass(){

        String redirectToFirstClassMessage =("""
                                               Oops!!! Economy seats are all taken.
                                               Will you like to buy an Economy ticket?
                                                                    
                                               If YES, press 1
                                               If NO, press 2
                                                                    
                                                """);

            System.out.println(redirectToFirstClassMessage);
            int redirectChoice = scanner.nextInt();
        switch (redirectChoice) {
            case 1 -> serveFirstClassTicket();
            case 2 -> System.out.println(THANK_YOU_MESSAGE);
            default -> {
                System.out.printf("Invalid option!!!%s", SPACE);
                redirectToFirstClass();
            }
        }

    }




    private static final String DECOR = ">>>> ".repeat(8);
    private static final String SPACE = ("\n".repeat(5));
    private static final String welcomeAddress = String.format("""
                %s
                    WELCOME TO SEMICOLON AIRWAYS
                %s
                
                PRESS 1 TO BUY A FIRST CLASS TICKET
                
                PRESS 2 TO BUY AN ECONOMY TICKET %s""", DECOR, DECOR, SPACE);




    private static final String THANK_YOU_MESSAGE = "THANK YOU FOR CHOOSING SEMICOLON AIRWAYS";






}
