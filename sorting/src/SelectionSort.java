import java.util.Scanner;
public class SelectionSort{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        n = sc.nextInt();
        int[] Arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arr[i]);
        }
        selectionsort(Arr);
        System.out.println("sorted array Arr:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arr[i]);

        }
    }
    private static void selectionsort(int[] Arr) {
        int n=Arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n ; j++) {
                if (Arr[j] < Arr[min_index]) {
                    min_index = j;
                }
            }
            //swap the minmum at proper place
            int temp;
            temp=Arr[min_index];
            Arr[min_index] =Arr[i]  ;
            Arr[i]  = temp;

        }
    }
}

