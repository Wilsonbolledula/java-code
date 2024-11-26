public class HelloWorld {
    public static void main(String[] args) {
        int number;
        
        // Check if an argument is provided
        if (args.length > 0) {
            // Parse the first argument as an integer
            number = Integer.parseInt(args[0]);
        } else {
            // Set a default value if no argument is provided
            number = 1000; // You can change this to any default number
            System.out.println("No number provided, using default: " + number);
        }

        System.out.println("You entered: " + number);
    }
}
