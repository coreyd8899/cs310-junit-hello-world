
public class Main {
    // Method to return the greeting message
    public String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        String message = "Hello, World!";
        System.out.println(message);
        System.out.println(reverse(message));
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}




