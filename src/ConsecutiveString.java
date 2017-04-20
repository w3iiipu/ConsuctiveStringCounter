//
//public class ConsecutiveString {
//
//    private static String sizeOfLargestGroup(String input) {
//        // failover
//        if (input == null || input.length() == 0) {
//            return "Please enter a String!";
//        } else if (input.length() == 1) {
//            return "The entered String is 1 character Long. The longest amount of consecutive "
//                    + "characters is obviously 1 at position 0.";
//        }
//
//        // Some descriptive variable names
//        int currentCharacterCount = 0, startIndexLargestGroup = 0, sizeLargesGroup = 0;
//
//        for (int index = 0; index < input.length() - 1; index++) {
//            currentCharacterCount++; // always count up
//
//            // if the current and the next character are not the same we
//            // consider the group to be over and reset the currentCharacterCount
//            // to 0
//            if (input.charAt(index) != input.charAt(index + 1)) {
//
//                // if the currentCharacterCounter is larger than the group seen
//                // before we update the largest group (both, start index and
//                // size)
//                if (currentCharacterCount > sizeLargesGroup) {
//                    sizeLargesGroup = currentCharacterCount;
//                    startIndexLargestGroup = index - currentCharacterCount + 1;
//                }
//                currentCharacterCount = 0;
//            }
//        }
//
//        // return a full string with every information we got
//        return "The longest amount of consecutive characters is " + sizeLargesGroup + " it is the char ["
//                + input.charAt(startIndexLargestGroup) + "] at position: " + startIndexLargestGroup;
//    }
//
//}
