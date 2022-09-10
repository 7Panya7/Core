package src.main.java.homework2.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7};

        try {
            int[] resultArray = searchNumber(arr, 10);
            System.out.println(Arrays.toString(resultArray));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] searchNumber(int[] array, int requiredNumber) {
        if (array == null) {
            throw new IllegalArgumentException("Список пуст!");
        }
        if (array.length < 2) {
            throw new IllegalArgumentException("Недостаточно элементов в списке!");
        }

        Map<Integer, Integer> twoNumber = new HashMap<>();

        for (int number : array) {
            Integer needNumber = requiredNumber - number;
            if (twoNumber.containsKey(number)) {
                return new int[]{needNumber, number};
            }
            twoNumber.put(needNumber, number);
        }
        return new int[]{};
    }
}
