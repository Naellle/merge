import static java.util.Arrays.sort;

public class mergeArrays {
    public static void main(String[] args) {
        int[] a1 = {1, 8, 4, 7, 1}; //первый массив
        int[] a2 = {8, 5, 3, 6}; //второй массив

        System.out.println(merge(a1, a2));


    }


    public static int[] merge(int x[], int y[]) { //метод в который передаем 2 целочисленных массива
        int res[] = new int[x.length + y.length]; //третий массив длинной первого и второго
        int n = x.length; //переменная длины первого массива
        int m = y.length; //переменная длины второго массива

        int i = 0, j = 0, e = 0; //i- переменная которая считает элементы в первом массиве, j - во втором массиве, e - в новом обьединенном массиве

        while (i < n && j < m) {  //обработка двух массивов
            if (x[i] <= y[j]) {
                res[e] = x[i];
                i++;

            } else {
                res[e] = y[j];
                j++;
            }

            e++;
        }
        while (i < n) {
            res[e] = x[i];
            i++;
            j++;

        }
        while (j < m) {
            res[e] = y[j];
            j++;
            e++;
        }
        return res;


    }

}
