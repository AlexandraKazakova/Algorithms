// 1. Рекурсивно найти n-ое число Фиббоначчи. Определить сложность.

// 2. Найти n-ое число Фибоначчи за O(n).

// 3. Найти сумму элементов главной диагонали в двумерном массиве.
//    Найти сумму элементов побочной диагонали в двумерном массиве.

// 4. Реализовать сдвиг элементов в массиве на n влево или право.1

public class Task1 {

    public static void main(String[]args) {
        System.out.println(fibonachi(4));
    }
    private static int fibonachi(int num){
        if(num == 0) {
            return 0;
        }
        if(num == 1){
            return 1;
        }
        else return fibonachi(num - 1) + fibonachi(num - 2);
    }
}
