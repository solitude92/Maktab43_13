import java.util.Arrays;

public class Maktab13<T> {
    public static <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static <T> void printArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static <T> void printArray(T[] array, int lowSubscript, int highSubscript) {
        if(highSubscript-lowSubscript<0 || highSubscript>=array.length)
            throw new IllegalArgumentException("Invalid zone!");
        else
            for (int i = lowSubscript; i <= highSubscript; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }


}
