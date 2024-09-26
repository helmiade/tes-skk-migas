import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] n = {12, 9, 13, 6, 10, 4, 7, 2};

        System.out.println("Nomor 1");
        question1(24);
        System.out.println("\nNomor 2a");
        question2a(5);
        System.out.println("\nNomor 2b");
        question2b(5);
        System.out.println("\nNomor 2c");
        question2c(5);
        System.out.println("\nNomor 2d");
        question2d(5);
        System.out.println("\nNomor 3");
        question3(n);
    }
    public static void question1(Integer n){
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0&& i % 4 != 0) {
                System.out.print("OK ");
            }
            else if (i % 4 == 0&& i % 3 != 0) {
                System.out.print("YES ");
            }
            else if (i % 12 == 0) {
                System.out.println("OKYES ");
            } else System.out.print(i+" ");
        }
    }

    public static void question2a(Integer n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(i);
            System.out.println();
        }
    }
    public static void question2b(Integer n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; 1 <= j; j--) System.out.print(j);
            System.out.println();
        }
    }
    public static void question2c(Integer n){
        int sum=0;
        int a=0;
        for (int i = 1; i <= n; i++) sum = sum + i;
        List<Integer> array = new ArrayList<>();
        for (int j = 1; j <= (sum / n)+1; j++) {
            if (j == 1) {
                for (int i = 1; i <= n; i++) array.add(i);
            } else if (j % 2 == 0) {
                for (int i = n - 1; i >= 1; i--) array.add(i);
            } else for (int i = 2; i <= n; i++) array.add(i);
        }
        for(int i=0;i<n;i++){
            a+=i;
            for(int k=a;k<=i+a;k++) System.out.print(array.get(k));
            System.out.println();
        }
    }

    public static void question2d(Integer n){
        int[][] matrix = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int row = 0; row < n; row++) matrix[row][i] = num++;
            } else {
                for (int row = n - 1; row >= 0; row--) matrix[row][i] = num++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }

    }
    public static void question3(int[] n){
        int[] array = Arrays.stream(n).filter(m -> m % 3 != 0).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}