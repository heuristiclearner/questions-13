/*write a java program to print all odd position character from the given string(ignore the white space). 
String text="type here to search"; */
public class Main {
    public static void main(String[] args) {
        String text = "type here to search";
        printOddPositionChars(text);
    }

    public static void printOddPositionChars(String text) {
        for (int i = 0; i < text.length(); i++) {
            // Skip white spaces
            if (text.charAt(i) == ' ') {
                continue;
            }
            // Check if index is odd
            if (i % 2 != 0) {
                System.out.print(text.charAt(i));
            }
        }
    }
}

