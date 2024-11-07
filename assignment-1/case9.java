// Problem 9: Password Validator
// Create a program that validates the strength of a user's password. The program should have the
// following features:
//  Prompt the user to enter a password.
//  Implement a set of rules to check the password's strength, such as minimum length,
// inclusion of uppercase and lowercase letters, digits, and special characters.
//  Provide feedback to the user on the password's strength (e.g., weak, medium, strong).
//  Allow the user to try again if the password is not strong enough.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class PasswordValidation{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        while(true){
            System.out.println("Enter your password: ");
            String pass = obj.nextLine();
            String strength = checkPass(pass);

            if(strength.equals("Strong")){
                System.out.println("your password is strong");
                break;
            }else{
                System.out.println(strength.toLowerCase() + ". Please try again.");
            }
        }
    }

    public static String checkPass(String password){
        int minlen = 8;
        Pattern ucpattern = Pattern.compile("[A-Z]");
        Pattern lcpattern = Pattern.compile("[a-z]");
        Pattern dpattern = Pattern.compile("\\d");
        Pattern scpattern = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]");

        Matcher hasupper = ucpattern.matcher(password);
        Matcher haslower = lcpattern.matcher(password);
        Matcher hasdigit = dpattern.matcher(password);
        Matcher haschar = scpattern.matcher(password);

        if(password.length()<minlen){
            return "password must be atleast 8 characters long";
        }
        if(!hasupper.find()){
            return "password must contain atleast one uppercase letter";
        }
        if(!haslower.find()){
            return "Password must contain at least one lowercase letter.";
        }
        if(!hasdigit.find()){
            return "Password must contain atleast one digit";
        }
        if(!haschar.find()){
            return "Password must contain at least one special character.";
        }


        if(password.length() >= minlen && hasupper.find() && haslower.find() && hasdigit.find() && haschar.find()){
            return "Strong";
        }else if(password.length() >= minlen && ((hasupper.find() && haslower.find()) || (hasupper.find() && hasdigit.find()) || (haslower.find() && hasdigit.find()))){
            return "Medium";
        }else{
            return "weak";
        }
    }
}