public class HelloApp {

    public static void main(String[] args) {
        String greetingName;

        if (args.length == 0) {
            greetingName = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;
            
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }
            greetingName = nameBuilder.toString();
        }

        System.out.println("Hello, " + greetingName + "!");
    }
}
