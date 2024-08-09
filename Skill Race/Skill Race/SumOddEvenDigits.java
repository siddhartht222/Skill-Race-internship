import java.util.Scanner;

public class SumOddEvenDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Digits :");
        long number = scanner.nextLong();  // Read the input number
        scanner.close();
        
        long temp = number;  // Copy of the number for processing
        int sumOdd = 0;     // Sum of odd digits
        int sumEven = 0;    // Sum of even digits
        
        while (temp > 0) {
            int digit = (int) (temp % 10);  // Extract the last digit
            if (digit % 2 == 0) {
                sumEven += digit;  // Add to even sum
            } else {
                sumOdd += digit;   // Add to odd sum
            }
            temp /= 10;  // Remove the last digit from the number
        }
        
        // Print the results separated by a space
        System.out.println( "The Sum Of Even Digits : "+ sumOdd);
        System.out.println("The Sum Of Odd Digits : " +sumEven);
    }
}
