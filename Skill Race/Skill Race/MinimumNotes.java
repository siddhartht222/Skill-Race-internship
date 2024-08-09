import java.util.Scanner;

public class MinimumNotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency :");
        int N = scanner.nextInt();  // Read the amount to be given as change
        scanner.close();
        
        // Array of note denominations in descending order
        int[] denominations = {100, 50, 10, 5, 2, 1};
        
        // Variable to keep track of the number of notes used
        int numOfNotes = 0;
        
        // Iterate over each denomination
        for (int denom : denominations) {
            // Use as many notes of this denomination as possible
            numOfNotes += N / denom;
            // Reduce the amount by the value of the notes used
            N = N % denom;
        }
        
        // Output the total number of notes used
        System.out.println("Total Numbers of Notes Used :" +numOfNotes);
    }
}
