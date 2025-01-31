public class Appti3 {
        public static void main(String[] args) {
            int rows = 4;
            int currentNumber = 1;
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }
                int[] line = new int[i];
                for (int j = 0; j < i; j++) {
                    line[j] = currentNumber++;
                }
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(line[j] + " ");
                }
                System.out.println();
            }
            
            currentNumber -= 1;
            for (int i = rows; i > 0; i--) {
                // Print leading spaces
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }
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
