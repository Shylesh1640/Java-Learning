/**
 * Java Basics Program
 * -------------------
 * This program demonstrates:
 * - The structure of a Java class and main() method
 * - Using System.out.println() and System.out.print()
 * - Single-line, multi-line, and Javadoc comments
 * - Importance of semicolons and whitespace
 * - Readable formatting
 */

public class JavaBasicsDemo {

    // main() method: the entry point of every Java program
    public static void main(String[] args) {
        
        // ===== Print Statements =====
        System.out.println("Hello, World!"); // Prints with a new line
        System.out.println("Learning Java is fun!");
        
        // Using print() instead of println()
        System.out.print("This will stay on the ");
        System.out.print("same line.\n");  // \n moves to the next line

        // ===== Comments in Java =====
        
        // Single-line comment: explains one line of code
        System.out.println("This line is explained by a single-line comment.");
        
        /*
         * Multi-line comment:
         * Useful for longer explanations
         * that span multiple lines.
         */
        System.out.println("This line is explained by a multi-line comment.");
        
        /**
         * Javadoc comment:
         * Used to generate documentation for classes and methods.
         * Example: This method is the starting point of the program.
         */
        System.out.println("This line is explained by a Javadoc comment.");
        
        // ===== Semicolons =====
        // Semicolons mark the end of each statement
        System.out.println("Statement 1"); System.out.println("Statement 2"); System.out.println("Statement 3");

        // ===== Whitespace =====
        // Both of these work the same, but the second one is easier to read:
        
        // Hard to read:
        System.out.println("Java");System.out.println("Lava");System.out.println("Guava");
        
        // Easier to read with whitespace:
        System.out.println("Java");
        System.out.println("Lava");
        System.out.println("Guava");
    }
}
