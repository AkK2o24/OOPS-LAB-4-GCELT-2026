public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String s1 = "Java";
        char[] chars = {'J', 'a', 'v', 'a', ' ', 'S', 'E'};

        String s2 = new String(chars);
        String s3 = new String(chars, 5, 2);

        String s4 = s1.concat(" Language");

        System.out.println("Literal: " + s1);
        System.out.println("Character array: " + s2);
        System.out.println("Sub-array: " + s3);
        System.out.println("s1 after concat: " + s1);
        System.out.println("New string: " + s4);
    }
}
