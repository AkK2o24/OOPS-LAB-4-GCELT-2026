public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(4, " SE");
        System.out.println("After insert: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.delete(0, 3);
        System.out.println("After delete: " + sb);

        StringBuilder builder = new StringBuilder("Java");
        builder.append(" Language");
        System.out.println("StringBuilder: " + builder);
    }
}
