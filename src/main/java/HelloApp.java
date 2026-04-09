public class HelloApp {

    public static void main(String[] args) {
        // Variable to hold the final name list
        String result;

        // Check if the user actually passed any arguments
        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder builder = new StringBuilder();
            
            // Loop through every name and add a comma/space after each one
            for (String name : args) {
                builder.append(name).append(", ");
            }
            
            // Cleanup: remove the very last ", " (2 characters) from the end
            // We use substring from index 0 to (total length - 2)
            result = builder.substring(0, builder.length() - 2);
        }

        // Print the final personalized greeting
        System.out.println("Hello, " + result + "!");
    }
}
