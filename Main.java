public class Main {
    public static void main(String[] args) {
        // Perform string operations
        String str1 = "Hello";
        String str2 = "World";

        // Concatenate strings
        String result = str1 + ", " + str2 + "!";
        System.out.println("Concatenated String: " + result);

        // Get the length of the string
        System.out.println("Length of the string: " + result.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + result.toUpperCase());

        // Check if the string contains a substring
        System.out.println("Contains 'World': " + result.contains("World"));

        // Replace a substring
        String replaced = result.replace("World", "Java");
        System.out.println("Replaced String: " + replaced);
    }
}
