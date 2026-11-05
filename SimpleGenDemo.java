class Gen<T> {
    private T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is: " + ob.getClass().getName());
    }
}

public class SimpleGenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType();
        System.out.println("Value: " + iOb.getob());

        Gen<String> strOb = new Gen<>("Generics Test");
        strOb.showType();
        System.out.println("Value: " + strOb.getob());
    }
}
