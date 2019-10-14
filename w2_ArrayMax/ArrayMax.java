package w2_ArrayMax;
// 2. Avand un array cu n elemente, afișați elementul maxim din array.

public class ArrayMax {

    private static void maxValue(int[] ints) {
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        maxValue(ints);
    }
}