// 3. Найти сумму элементов главной диагонали в двумерном массиве.
//    Найти сумму элементов побочной диагонали в двумерном массиве.

public class Task3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};

        if (array[0].length == array.length){
            System.out.println(mainDiagonalSumTwo(array) + " - главная диагональ");
        }
        else{
            System.out.println(mainDiagonalSum(array) + " - главная диагональ");
        }

        System.out.println(secondaryDiagonalSum(array) + " - побочная диагональ");
    }
    private static int mainDiagonalSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    private static int mainDiagonalSumTwo(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    private static int secondaryDiagonalSum(int[][] arr){
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for(int j = 0; j < arr.length; j++){
                if(i + j == arr.length - 1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
