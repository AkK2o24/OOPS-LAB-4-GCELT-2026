public class StringConversionDemo {
    public static void main(String[] args) {
        int age = 20;
        double price = 149.99;
        boolean inStock = true;

        String strAge = String.valueOf(age);
        String strPrice = String.valueOf(price);
        String strStock = String.valueOf(inStock);

        String messyText = "   Clean Code Java   ";

        System.out.println("Integer: " + strAge);
        System.out.println("Double: " + strPrice);
        System.out.println("Boolean: " + strStock);
        System.out.println("Trimmed text: '" + messyText.trim() + "'");
    }
}
