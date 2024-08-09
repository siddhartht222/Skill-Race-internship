import java.util.Scanner;

public class SimpleChatbot {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Print a welcome message
        System.out.println("Hello! I'm Chatbot. How can I help you today?");
        
        while (true) {
            // Read user input
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            
            // Convert input to lower case for easier comparison
            userInput = userInput.toLowerCase();
            
            // Check for various inputs and respond accordingly
            if (userInput.equals("hi") || userInput.equals("hello")) {
                System.out.println("Chatbot: Hello! How can I assist you?");
            } else if (userInput.equals("how are you")) {
                System.out.println("Chatbot: I'm just a bot, but I'm doing great! How about you?");
            } else if (userInput.equals("what's your name") || userInput.equals("what is your name")) {
                System.out.println("Chatbot: I am a simple chatbot created by Java.");
            } else if (userInput.equals("bye")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;  // Exit the loop and end the program
            } else {
                System.out.println("Chatbot: I'm sorry, I don't understand that.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
