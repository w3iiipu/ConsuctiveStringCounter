import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String UserInput = scan1.nextLine().toLowerCase();

        sizeOfLargestGroup(UserInput);


    }
//    TODO does not account for if the longest consecutive character is at the end of the string
    public static void sizeOfLargestGroup(String input) {
        // failover
        if (input == null || input.length() == 0) {
            System.out.println( "Please enter a String!");
        } else if (input.length() == 1) {
            System.out.println( "The input is 1 character Long. The longest amount of consecutive characters is obviously 1 at position 0.");
        }

        // Some descriptive variable names
        int currentCharacterCount = 0;
        int startIndexLargestGroup = 0;
        int sizeLargestGroup = 0;

        for (int index = 0; index < input.length()-1; index++) {
            currentCharacterCount++; // always count up

            // to account for if consecutive char is towards the end of the string.
            char current = input.charAt(index);
            char next = index + 1 >= input.length() ? '\0' : input.charAt(index + 1);

            // if the current and the next character are not the same we
            // consider the group to be over and reset the currentCharacterCount
            // to 0
            if (current != next) {

                // if the currentCharacterCounter is larger than the group seen
                // before we update the largest group (both, start index and
                // size)
                if (currentCharacterCount > sizeLargestGroup) {
                    sizeLargestGroup = currentCharacterCount;
                    startIndexLargestGroup = index - currentCharacterCount + 1;
                }
                currentCharacterCount = 0;
            }
        }
        // return a full string with every information we got
        System.out.println( "The longest amount of consecutive characters is " + sizeLargestGroup + " it is the char ["
                + input.charAt(startIndexLargestGroup) + "] at position: " + (startIndexLargestGroup+1));
    }

}
