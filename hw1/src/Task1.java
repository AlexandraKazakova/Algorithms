// 1. Рекурсивно найти n-ое число Фиббоначчи. Определить сложность.

// Сложность O(e в степени n)

public class Task1 {

    public static void main(String[]args) {
        System.out.println(fibonachi(10));
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