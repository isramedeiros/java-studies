import java.util.Scanner;

public class Delimiter {
        public static void main(String[] args) {
            // Create a scanner object
            Scanner myObj = new Scanner("A string to scan");

            // Find the delimiter
            System.out.println(myObj.delimiter());

            // Close the scanner
            myObj.close();
        }
    }
