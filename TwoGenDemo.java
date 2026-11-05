class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Type T: " + ob1.getClass().getName());
        System.out.println("Type V: " + ob2.getClass().getName());
    }

    void showValues() {
        System.out.println("First value: " + ob1);
        System.out.println("Second value: " + ob2);
    }
}

public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj =
                new TwoGen<>(101, "Roll Number");

        tgObj.showTypes();
        tgObj.showValues();
    }
}
