public class Pyramid {
    public static void main(String[] args) {
        String inputString = "I like Java and automation";

        // Split the input string into words using space as the delimiter
        String[] words = inputString.split(" ");

        // Iterate through the words and print the first letter of each word
        for (String word : words) {
            // Check if the word is not empty (to handle multiple spaces)
            if (!word.isEmpty()) {
                // Get the first character of the word and convert it to uppercase
                char firstLetter = Character.toUpperCase(word.charAt(0));
                System.out.print(firstLetter);
            }
        }

        // Print a newline character to end the line
        System.out.println();
    }
}
