package Chapter6;

import javax.swing.*;
import java.util.Scanner;

public class NokiaPhone {
    Scanner input = new Scanner(System.in);

    public String welcomeMessage(){
        return "Hello User, this is Nokia3310";
    }

    public String menuPrompt(){
        return """
                Enter 1 --> Phonebook
                Enter 2 --> Messages
                Enter 3 --> chat
                Enter 4 --> Call Register
                Enter 5 --> Tones
                Enter 6 --> Settings
                Enter 7 --> Call divert
                Enter 8 --> Games
                Enter 9 --> Extras
                Enter 10 --> SIM services^3
                Enter 0 --> Back
                Enter 00 --> To terminate program
                """;

    }
    public void menuSelection(){
        System.out.println(menuPrompt());
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println(phoneBookPrompt());
                phoneBookSelection();
            }
            case 2 -> System.out.println(messageMenu());
                case 3 -> System.out.println(chatMenu());
                case 4 -> System.out.println(callRegisterMenu());
                case 5 -> System.out.println(toneMenu());
                case 6 -> System.out.println(settingMenu());
                case 7 -> System.out.println(callDivertMenu());
                case 8 -> System.out.println(gamesMenu());
                case 9 -> System.out.println(extrasMenu());
                case 10 -> System.out.println(simServicesMenu());
                case 20 -> choiceToTerminateOrNot();
                default -> System.out.println("Invalid input!!!!!");
            }
        }
    public String phoneBookPrompt(){
        return """
                1 --> Search
                2 --> Service Nos.^1
                3 --> Add name
                4 --> Erase
                5 --> Edit
                6 --> Assign tone
                7 --> Send b'card
                8 --> Options
                9 --> Speed dials
                10 --> Voice tags
                0 --> Back
                20 --> To terminate program
                """;
    }

    public void phoneBookSelection(){
        System.out.println(phoneBookPrompt());
            int phoneBookChoice = input.nextInt();
            switch(phoneBookChoice){
                case 1 -> {
                    System.out.println(searchPhoneBookPrompt());
                    searchPhoneBookSelection();
                }
                case 2 -> System.out.println(serviceNosInPhoneBook());
                case 3 -> System.out.println(addNameInPhoneBook());
                case 4 -> System.out.println(eraseNameInPhoneBook());
                case 5 -> System.out.println(editNameInPhoneBook());
                case 6 -> System.out.println(assignToneInPhoneBook());
                case 7 -> System.out.println(sendBCardInPhoneBook());
                case 8 -> System.out.println(optionsInPhoneBook());
                case 9 -> System.out.println(speedDialInPhoneBook());
                case 10 -> System.out.println(voiceTagsInPhoneBook());
                case 0 -> menuSelection();
                case 20 -> choiceToTerminateOrNot();

                default -> System.out.println("Invalid input!!!!!");
            }
        }

    public String searchPhoneBookPrompt() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                0 --> Back
                20 --> To terminate program
                """;
    }

    private void searchPhoneBookSelection() {
        System.out.println(searchPhoneBookPrompt());
        int searchPhoneBookChoice = input.nextInt();
        switch (searchPhoneBookChoice){
            case 1 -> {System.out.println("Please enter 0 or 20"); searchPhoneBookSelection();}
            case 0 -> phoneBookSelection();
            case 20 -> choiceToTerminateOrNot();
        }
    }
    public String serviceNosInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                0 --> Back
                """;
    }

    public String addNameInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                0 --> Back
                """;
    }

    public String eraseNameInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                0 --> Back
                """;
    }

    public String editNameInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                0 --> Back
                """;
    }

    public String assignToneInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                """;
    }

    public String sendBCardInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                0 --> Back
                """;
    }

    public String optionsInPhoneBook(){
        return """
                1 --> Type of view
                2 --> Memory status
                0 --> Back
                """;
    }

    public String speedDialInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                0 --> Back
                """;
    }

    public String voiceTagsInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                0 --> Back
                """;
    }

    public String messageMenu(){
        return """
                1 --> Write Message
                2 --> Inbox
                3 --> Outbox
                4 --> Picture messages
                5 --> Templates
                6 --> Smileys
                7 --> Message settings
                8 --> Info services
                9 --> Voice mailbox number
                10 --> Service command editor
                0 --> Back
                """;
    }

    public String chatMenu(){
        return """
                1 --> To start chat
                0 --> Back
                """;
    }

    public String callRegisterMenu(){
        return """
                1 --> Missed calls
                2 --> Received calls
                3 --> Dialled calls
                3 --> Erase recent call lists
                3 --> Show call duration
                3 --> Show call costs
                3 --> Call cost settings
                3 --> Prepaid credit
                0 --> Back
                """;
    }

    public String toneMenu(){
        return """
                1 --> Ringing tone
                2 --> Ringing volume
                3 --> Incoming call alert
                4 --> Composer
                5 --> Message alert tone
                6 --> Keypad tones
                7 --> Warning and game tones
                8 --> Vibrating alert
                9 --> Screen saver
                0 --> Back
                """;
    }

    public String settingMenu(){
        return """
                1 --> Call setting
                2 --> Phone setting
                3 --> Security setting
                3 --> Restore factory settings
                0 --> Back
                """;
    }

    public String callDivertMenu(){
        return """
                1 --> Divert call
                0 --> Back
                """;
    }

    public String gamesMenu(){
        return """
                1 --> Snake games
                2 --> Solitaire
                3 --> Pac mania
                0 --> Back
                """;
    }

    public String extrasMenu(){
        return """
                1 --> Calculator
                2 --> Reminders
                3 --> Clock
                3 --> Profiles
                0 --> Back
                """;
    }

    public String simServicesMenu(){
        return """
                1 --> Choose SIM
                0 --> Back
                """;
    }

    public void choiceToTerminateOrNot(){
            System.out.println("Do you wish to continue: yes/no");
            String userChoice = input.next();
            switch (userChoice){
                case "yes":
                    System.out.println(menuPrompt());
                    menuSelection();
                    break;
                case "no":
                    System.out.println(welcomeMessage());
                    System.exit(0);
                default:if (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no")){
                    System.out.println("Invalid entry. Kindly type 'yes' or 'no'");
                    choiceToTerminateOrNot();
                }
                    //READ UP JOptionPane
                    break;
            }
    }
}
