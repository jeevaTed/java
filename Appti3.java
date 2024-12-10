public class Appti3 {
        public static void main(String[] args) {
            int rows = 4; // Number of rows in the top half
            int currentNumber = 1;
            // Generate the top half of the pattern
            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }
                // Create and print the numbers in reverse order
                int[] line = new int[i];
                for (int j = 0; j < i; j++) {
                    line[j] = currentNumber++;
                }
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(line[j] + " ");
                }
                System.out.println();
            }
            // Generate the bottom half of the pattern
            currentNumber -= 1; // Reset the currentNumber to continue in reverse
            for (int i = rows; i > 0; i--) {
                // Print leading spaces
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }
                // Create and print the numbers in reverse order
                int[] line = new int[i];
                for (int j = 0; j < i; j++) {
                    line[j] = currentNumber--;
                }
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(line[j] + " ");
                }
                System.out.println();
            }
       }
}
