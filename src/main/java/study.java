import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something");
         String input = sc.nextLine();
         String choice;
        do {
            System.out.println("You Entered: \"" + StringUtils.defaultString(input) + "\"");
         if (input == input)
            if (StringUtils.isAlphanumeric(input)) {
                System.out.println(input + " is not a number: ");
            } else if (StringUtils.isNumeric(input)){
                System.out.println(input + "is a number");
            }
            System.out.println("Flipped Case: " + StringUtils.swapCase(input));
            System.out.println("Reversed: " + StringUtils.reverse(input));
            System.out.println("Which to continue?");
            choice = sc.nextLine();
             if (choice.startsWith("N") || choice.startsWith("n"));
        } while (choice.startsWith("Y") || choice.startsWith("y"));
            System.out.println("GoodBye");



    }


}
