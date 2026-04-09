public class HelloApp {

    public static void main(String[] args) {
        // Variable to store our name list
        String result;

        // Check if arguments were passed
        if (args.length == 0) {
            result = "World";
        } else {
            // String.join handles the array and delimiters automatically
            // No trailing commas, no loops, just one line of code.
            result = String.join(", ", args);
        }

        // Output the final greeting
        System.out.println("Hello, " + result + "!");
    }
}
