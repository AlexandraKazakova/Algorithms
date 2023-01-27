package Lec_2;

public class Find {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = new int[]{4, 2, 9, 5, 0 , 3, 2};

        //System.out.println(find(array, 5));
        //System.out.println(binarySearch(array, 9, 0, 8));
        sort(arr);
        for (int num:arr) {
            System.out.print(num + " ");
        }
    }

    public static int find(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value, int min, int max){
        int midPoint;

        if(max < min){
            return -1;
        }
        else{
        midPoint = (max - min) / 2 + min;
        }
        if(array[midPoint] < value){
            return binarySearch(array,value, midPoint + 1, max);
        }
        else if(array[midPoint] > value){
                return binarySearch(array, value, min, midPoint - 1);
            }
        else{
            return midPoint;
        }
    }

    public static void quickSort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
            }
        }
        while (leftPosition <= rightPosition) ;

        if (leftPosition < endPosition) {
            quickSort(array, leftPosition, endPosition);
        }
        if(startPosition < rightPosition){
            quickSort(array, startPosition,rightPosition);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex; // наибольший элемент, как корень
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        // Если левый дочерний элемент больше корня
        if(leftChild < heapSize && array[leftChild] > array[largest]){
            largest = leftChild;
        }

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if(rightChild < heapSize && array[rightChild] > array[largest]){
            largest = rightChild;
        }

        // Если самый большой элемент не корень
        if(largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array, heapSize, largest);
        }
    }

    public static void sort(int[] array){
        //Построение кучи (перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        //Извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            //Передаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //Вызываем heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }
}
