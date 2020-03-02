import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        for (int j = 100000; j <= 200000; j = j + 10000) {
            long i = currentTimeMillis();
            int[] arr1 = new int[j];
            for (int h = 0; h < j; h++) {
                arr1[h] = (int)(Math.random() * j);
            }
           /* out.println("Before Insertion Sort");
            for (int k : arr1) {
            out.print(k + " ");}

            out.println();*/
            //se elimina uno de los metodos para realizar los tiempos del otro
            insertionSort(arr1);
            mergeSort(arr1,arr1.length); 
            /*out.println("After Insertion Sort");
            for (int l : arr1) {
                out.print(l + " ");}
            out.println();*/
            long f = currentTimeMillis();
            out.println(f - i);
        }
    }

    
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
