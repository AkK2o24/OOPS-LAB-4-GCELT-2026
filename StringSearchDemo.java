public class StringSearchDemo {
    public static void main(String[] args) {
        String text = "Object Oriented Programming in Java";
        char[] chars = new char[8];

        System.out.println("Character at index 3: " + text.charAt(3));

        text.getChars(0, 8, chars, 0);
        System.out.println("Copied characters: " + new String(chars));

        System.out.println("Index of Java: " + text.indexOf("Java"));
        System.out.println("First index of a: " + text.indexOf('a'));
        System.out.println("Last index of a: " + text.lastIndexOf('a'));
    }
}
