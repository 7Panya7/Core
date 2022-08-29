package Task1;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        addToArray(array);
        System.out.println("Минимальное значение " + minOfArray(array));
        System.out.println("Максимальное значение " + maxOfArray(array));
        System.out.println("Среднее значение " + average(array));

    }

    public static int minOfArray(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int maxOfArray(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int average(int[][] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        int result = sum / count;
        return result;
    }

    public static int random(long begin, long end) {
        long current = System.currentTimeMillis();
        long random = begin + current % (end - begin);
        return (int) random;
    }

    public static void addToArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random(0,100);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
