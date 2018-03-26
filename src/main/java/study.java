import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
//import java.lang.String;

public class study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something");
         String input = sc.nextLine();
//         String choice;
//        do {
            System.out.println("You Entered: \"" + StringUtils.defaultString(input) + "\"");
//         if (input == input)
        String message;
            if (stringIsANumber(input)) {
                message = " is a number: ";
            } else {
                message= " is not a number";
            }
        System.out.println(input + message);
            System.out.println("Flipped Case: " + flipTheStringCase(input));
            System.out.println("Reversed: " + isStringReverse(input) );
//            System.out.println("Which to continue?");
//            choice = sc.nextLine();
//             if (choice.startsWith("N") || choice.startsWith("n"));
//        } while (choice.startsWith("Y") || choice.startsWith("y"));
//            System.out.println("GoodBye");
    }

    public static boolean stringIsANumber(String input) {
       return StringUtils.isNumeric(input);
    }

    public static String flipTheStringCase(String input){
        return StringUtils.swapCase(input);
    }

    public static String isStringReverse(String input){
        return StringUtils.reverse(input);
    }

}
