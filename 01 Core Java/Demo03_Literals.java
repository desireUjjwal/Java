// Literals in Java are the fixed values assigned to variables. They represent data directly in the code.
// Different types of literals include integer literals, floating-point literals, character literals, string literals,
public class Demo3_Literals {
    public static void main(String[] args) {
        int num1 = 0b101;  // Binary literal (5 in decimal)
        int num2 = 0x7E;   // Hexadecimal literal (126 in decimal)
        int num3 = 075;    // Octal literal (61 in decimal)
        int num4 = 100_000_000; // Underscore in numeric literal for better readability
        double num5 = 12e10; // Scientific notation (12 * 10^10)
        char c = 'a'; // Character literal
        c++; // Increment character to next Unicode value
        System.out.println(num1 +" "+ num2 +" "+ num3 + " "+ num4 + " " + num5 + " " + c);

    }
}
