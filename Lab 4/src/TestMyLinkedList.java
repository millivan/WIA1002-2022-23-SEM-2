public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> cList = new MyLinkedList<>();
        cList.add('a');
        cList.add('b');
        cList.add('c');
        cList.add('d');
        cList.add('e');
        cList.print();
        System.out.println("The reversed list is :" );
        cList.reverse();
        System.out.println("\nThe size of the list is : " + cList.getSize());
        System.out.println("\nThe first value in the list is : " +  cList.get(0));
        System.out.println("\nThe last value in the list is : " + cList.get(4));
        System.out.println("\nThe removed value in the list is : " + cList.remove(2));
        System.out.println("\nThe content of the list : ");
        cList.print();
        System.out.println("\nThe index value for item 'b'(second item) of the list is : " +  cList.indexOf('b'));
        System.out.println("\nThe index value for item 'd'(third item) of the list is : " +  cList.lastIndexOf('d'));
        System.out.println("\nDoes the list contain item 'c' : " +  cList.contains('c'));

        cList.set(0,'j');
        cList.set(1,'a');
        cList.set(2,'v');
        cList.set(3,'a');
//        cList.set(4,'o');
        cList.print();
    }
}