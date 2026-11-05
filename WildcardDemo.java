class WildcardStats<T extends Number> {
    T[] nums;

    WildcardStats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for (T num : nums) {
            sum += num.doubleValue();
        }

        return sum / nums.length;
    }

    boolean sameAvg(WildcardStats<?> ob) {
        return Math.abs(this.average() - ob.average()) < 0.0001;
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] iNums = {1, 2, 3, 4, 5};
        Double[] dNums = {1.0, 2.0, 3.0, 4.0, 5.0};

        WildcardStats<Integer> iOb = new WildcardStats<>(iNums);
        WildcardStats<Double> dOb = new WildcardStats<>(dNums);

        System.out.println("Averages match: " + iOb.sameAvg(dOb));
    }
}
