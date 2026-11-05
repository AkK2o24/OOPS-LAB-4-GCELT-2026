public class GenericMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (V element : y) {
            if (x.equals(element)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        System.out.println("2 in nums: " + isIn(2, nums));

        String[] strs = {"apple", "banana", "cherry"};
        System.out.println("'mango' in strs: " + isIn("mango", strs));
    }
}
