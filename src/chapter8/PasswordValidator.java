package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    private static String username;
    private static String currentPassword;

    private static boolean valid;
    private static String errorMessage;

    private static Scanner scanner = new Scanner(System.in);

    /**
     * declaring a constructor to get the username and current password
      * @param username
     * @param currentPassword
     */
    public PasswordValidator(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public void closeScanner(){
        scanner.close();
    }

    public static void main(String[]args){
        var validator = login();
        validator.printPasswordRules();

        do{
            var proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }

        }while(!validator.isValid());

        System.out.println("The proposed password is valid");

        validator.closeScanner();
    }

    public static PasswordValidator login(){
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        return new PasswordValidator(username, password);
    }
    public static void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public static String getProposedPassword(){
        System.out.println("Enter your new password: ");
        return scanner.nextLine();
    }

    public static void changePassword(String newPassword){

        valid = true;
        errorMessage = "";

        if (newPassword.length() <8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters";
        }

        if (newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must contain an uppercase letter";
        }

        if (newPassword.matches("[a-zA-Z0-9]*")){
            valid = false;
            errorMessage += "\n Your password must contain a special character e.g %,*,&";
        }

        if (newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password must not contain your username";
        }

        if (newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your new password must not be the same as your old password";
        }
    }

}
