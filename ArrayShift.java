import java.util.Scanner;

public class ArrayShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input size array A: ");
        int n = in.nextInt();

        System.out.println("Input element's array A: ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        System.out.print("Input K: ");
        int k = in.nextInt();

        // Циклічний зсув масиву A(n) на k позицій вправо
        for (int i = 0; i < k; i++) {
            int temp = A[n - 1];
            for (int j = n - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = temp;
        }

        // Виведення масиву після циклічного зсуву
        System.out.println("Масив після циклічного зсуву: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        in.close();
    }
}
