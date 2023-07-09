package Lab8b;

public class C {
    public static long exponent(int x, int m) {
        if (m == 0) { return 1; }
        if (m == 1) { return x; }
        return x * exponent(x, m-1);
    }

    public static void main(String[] args) {
        System.out.println("exponent(10, 3): " + exponent(10, 3));
        System.out.println("exponent(5, 5): " + exponent(5,  5));
        System.out.println("exponent(17, 8): " + exponent(17, 4));
    }
}
