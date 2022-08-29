package src.main.java.Task2;

import org.junit.Assert;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,6,3,2,5,1,4,9};
        sorter(array);
        print(array);
    }

    public static void sorter(int[] arrays) {
        boolean isSort = false;
        int num;

        while (!isSort) {
            isSort = true;
            for (int i = 0; i < arrays.length - 1; i++) {
                if (arrays[i] > arrays[i + 1]) {
                    isSort = false;
                    num = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = num;
                }
            }
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Test
    public void testOfSort() {
        int[] array = {5,6,3,2,5,1,4,9};
        sorter(array);
        int[] sortArray = {1,2,3,4,5,5,6,9};
        Assert.assertArrayEquals(array, sortArray);
    }
}
