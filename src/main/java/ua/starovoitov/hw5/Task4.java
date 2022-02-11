package ua.starovoitov.hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Удаление из массива k-го элемента со сдвигом всех расположенных
 * справа от него элементов на одну позицию влево.
 * *Необходимо создать новый массив, в котором удаляется элемент
 * и вернуть его из метода. Изначальный массив не должен измениться
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayRandom(array,20);
        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));

        int element;
        do {
            System.out.print("Enter number of element for deleting: ");
            Scanner sc = new Scanner(System.in);
            element = sc.nextInt();
        } while (element <=0 || element >= array.length);

        System.out.println("result array after deleted element in position " + element);
        System.out.println(Arrays.toString(removeElementWithPosFromArray(array,element)));

        System.out.println("result array after deleted element in index " + element);
        System.out.println(Arrays.toString(removeElementWithIndexFromArray(array,element)));

        System.out.println("result array after deleted element in index (second way)" + element);
        System.out.println(Arrays.toString(removeElementWithIndexFromArray2(array,element)));

        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));
    }

    private static int[] removeElementWithIndexFromArray(int[] array, int indexElement){
        testParameters(array, indexElement);
        int[] result = new int[array.length-1];
        System.arraycopy(array, 0, result, 0, indexElement);
        System.arraycopy(array, indexElement+1, result, indexElement, array.length-indexElement-1);
        return result;
    }

    private static int[] removeElementWithIndexFromArray2(int[] array, int indexElement){
        testParameters(array, indexElement);
        int[] result = new int[array.length-1];
        int i=0;

        for (int j = 0; j < array.length; j++) {
            if (j != indexElement) {
                result[i] = array[j];
                i++;
            }
        }

        return result;
    }

    private static int[] removeElementWithPosFromArray(int[] array, int posElement){
        testParameters(array, posElement);
        int[] result = new int[array.length-1];
        System.arraycopy(array, 0, result, 0, posElement-1);
        System.arraycopy(array, posElement, result, posElement-1, array.length-posElement);
        return result;
    }

    private static void fillArrayRandom(int[] array, int maxValue) {
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxValue);
        }
    }


    private static void testParameters(int[] array, int indexElement) {
        if (array.length == 0) {
            throw new RuntimeException("array empty");
        }
        if (indexElement < 0 || indexElement >= array.length) {
            throw new RuntimeException("error index element");
        }
    }
}
