public class StringComparisonDemo {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "JAVA";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("Ignore case: " + s1.equalsIgnoreCase(s3));

        String a = "Apple";
        String b = "Banana";

        System.out.println("compareTo result: " + a.compareTo(b));
    }
}
