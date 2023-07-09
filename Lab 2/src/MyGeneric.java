public class MyGeneric<E> {
    private E e;
    public MyGeneric() {}
    public MyGeneric(E e) {
        this.e = e;
    }

    public void set(E e) {
        this.e = e;
    }
    public E get() {
        return e;
    }
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        strObj.set("Java");
        intObj.set(123);
        System.out.println(strObj.get());
        System.out.println(intObj.get());

    }
}