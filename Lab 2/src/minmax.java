public class minmax {

    //use Comparable interface to compare the values
    public static <E extends Comparable<E>> String minmax(E[] array) {
        E min = array[0];
        E max = array[0];

        for(int i=0; i<array.length; i++) {
            if(min.compareTo(array[i])>0)
                min = array[i];
            if(max.compareTo(array[i])<0)
                max = array[i];
        }
        return "Min = " + min + " Max = " + max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        String intStr = minmax(intArray);
        System.out.println(intStr);

        String strStr = minmax(strArray);
        System.out.println(strStr);
    }

}