class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for (T num : nums) {
            sum += num.doubleValue();
        }

        return sum / nums.length;
    }
}

public class BoundedGenDemo {
    public static void main(String[] args) {
        Integer[] iNums = {1, 2, 3, 4, 5};
        Stats<Integer> iStats = new Stats<>(iNums);

        Double[] dNums = {1.5, 2.5, 3.5};
        Stats<Double> dStats = new Stats<>(dNums);

        System.out.println("Integer Average: " + iStats.average());
        System.out.println("Double Average: " + dStats.average());

        // Stats<String> sStats = new Stats<>(new String[]{"A", "B"});
        // This gives a compile-time error because String is not a Number.
    }
}
