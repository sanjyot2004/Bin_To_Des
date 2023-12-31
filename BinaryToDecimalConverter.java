import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        while (continueConversion) {
            System.out.print("Enter a binary number: ");
            String binaryString = scanner.nextLine();

            // Validate binary input
            if (!binaryString.matches("[01]+")) {
                System.out.println("Invalid binary number. Please enter a valid binary number.");
                continue;
            }

            try {
                // Convert binary to decimal
                int decimal = Integer.parseInt(binaryString, 2);
                System.out.println("Decimal equivalent: " + decimal);
            } catch (NumberFormatException e) {
                System.out.println("Error converting binary to decimal: " + e.getMessage());
            }

            // Ask if user wants to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
                continueConversion = false;
            }
        }

        System.out.println("Exiting the program.");
        scanner.close();
    }
}

