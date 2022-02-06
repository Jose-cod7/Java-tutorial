package chapter8;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator {

    //private static String username;
    private String username;
    private String currentPassword;

    private int passwordLong = 8;

    private boolean valid;
    private String errorMessage;
    private static Scanner scanner = new Scanner(System.in);

    public PasswordValidator(String username, String currentPassword) {
        this.username = username;
        this.currentPassword = currentPassword;
    }

    //Getters
    public boolean isValid() {
        return valid;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void closeScanner() {
        scanner.close();
    }
    
    public static void main(String args[]){
        var validator = login();
        System.out.println(validator.username);
        System.out.println(validator.currentPassword);
        validator.printPasswordRules();

        do {
            var proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
        } while(!validator.valid);

        System.out.println("The proposed password is valid");

        validator.closeScanner();

        
    }
    
    public static PasswordValidator login(){
        System.out.println("Enter your name:");
        String username = scanner.nextLine();
        
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        
        return new PasswordValidator(username,  password);
    }

    public  void printPasswordRules() {
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
    }

    public String getProposedPassword() {
        System.out.println("Enter your new password:" );
        return scanner.nextLine();
    }

    public void changePassword(String newPassword) {

        valid = true;
        errorMessage = "";

        if (newPassword.length() < passwordLong ) {
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters";
        }

        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter";
        }

        //Alternatively, can loop through string and use Character.isUpperCase on each char

        if(newPassword.matches("[a-zA-Z0-9]*")){
            valid = false;
            errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
        }

        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your user name";
        }

        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different fro your current password";
        }
    }
}
