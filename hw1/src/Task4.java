// 4. Реализовать сдвиг элементов в массиве на n влево или право.

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = shiftRight(array, 1);
        printArray(newArray);
    }

    private static int[] shiftRight(int[] arr, int num){
        int first = arr[0];
        int second;
        int count = 0;
        int l = arr.length;
        for (int i = 0; l > 0; i += num) {
            if(i + num > arr.length - 1){
                second = arr[0 + count];
                arr[0 + count] = first;
                count += num;
            }
            else {
                second = arr[i + num];
                arr[i + num] = first;
            }
            first = second;
            l--;
        }
        return arr;
    }

    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
