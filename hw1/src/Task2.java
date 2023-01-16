// 2. Найти n-ое число Фибоначчи за O(n).

public class Task2 {
    public static void main(String[] args) {
        System.out.println(fibonachi(10));
    }
    private static int fibonachi(int num){
        int num0 = 0;
        int num1 = 1;
        int num2;
        int count = 0;

        if (num == 0 || num == 1){
            return num;
        }
        else{
            while(count < num){
                num2 = num0 + num1;
                num0 = num1;
                num1 = num2;
                count ++;
            }
            return num0;
        }
    }
}
