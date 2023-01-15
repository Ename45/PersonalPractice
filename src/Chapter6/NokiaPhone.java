package Chapter6;

import javax.swing.*;
import java.util.Scanner;

public class NokiaPhone {
    Scanner input = new Scanner(System.in);
    int userInput;
    String userChoice;

    public String welcomeMessage(){
        System.out.println("Hello User, this is Nokia3310");
        return phoneMenu();
    }

    public String phoneMenu(){
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
                """;
    }
    public void phoneMenuSelection(){
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> System.out.println(phoneBookMenu());
            case 2 -> System.out.println(messageMenu());
            case 3 -> System.out.println(chatMenu());
            case 4 -> System.out.println(callRegisterMenu());
            case 5 -> System.out.println(toneMenu());
            case 6 -> System.out.println(settingMenu());
            case 7 -> System.out.println(callDivertMenu());
            case 8 -> System.out.println(gamesMenu());
            case 9 -> System.out.println(extrasMenu());
            case 10 -> System.out.println(simServicesMenu());
            case 0 -> System.out.println(welcomeMessage());
            default -> System.out.println("Invalid input!!!!!");
        }
    }
    public String phoneBookMenu(){
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
                """;
    }

    public void phoneBookSelection(){
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> System.out.println(searchPhoneBook());
            case 2 -> System.out.println(serviceNosInPhoneBook());
            case 3 -> System.out.println(addNameInPhoneBook());
            case 4 -> System.out.println(eraseNameInPhoneBook());
            case 5 -> System.out.println(editNameInPhoneBook());
            case 6 -> System.out.println(assignToneInPhoneBook());
            case 7 -> System.out.println(sendBCardInPhoneBook());
            case 8 -> System.out.println(optionsInPhoneBook());
            case 9 -> System.out.println(speedDialInPhoneBook());
            case 10 -> System.out.println(voiceTagsInPhoneBook());
            case 0 -> System.out.println(phoneBookMenu());
        }
    }
    public String searchPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                """;
    }

    public String serviceNosInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                """;
    }

    public String addNameInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                """;
    }

    public String eraseNameInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                """;
    }

    public String editNameInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
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
                """;
    }

    public String optionsInPhoneBook(){
        return """
                1 --> Type of view
                2 --> Memory status
                """;
    }

    public String speedDialInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
                """;
    }

    public String voiceTagsInPhoneBook() {
        return """
                1 --> FUNCTIONS WILL BE ADDED LATER!!!!!
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
            userChoice = input.next();
            switch (userChoice){
                case "yes":
                    System.out.println(phoneMenu());
                    phoneMenuSelection();
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
