import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 5, 4, 9, 90, 242};
        Character[] array1={'a', 'b', 'c', 'f', 's', 'w'};
        Double[] array2={2.2 , 3.5, 8.8, 6.5, 95.1, 74.8};
        String[] arrayString = {"Hi", "Hello", "Bye", "Love"};

        Maktab13.printArray(array);
        Maktab13.printArray(array1);
        Maktab13.printArray(array2);

        System.out.println("*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*");

        Maktab13.printArray(array, 1, 2);
        Maktab13.printArray(array1, 0, 3);
        Maktab13.printArray(array2, 4, 5);
//        Maktab13.printArray(array, 1, 13);

        System.out.println("*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*");

        Maktab13.printArray(arrayString);

    }
}
