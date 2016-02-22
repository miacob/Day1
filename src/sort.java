//  Created by Andrei on 2/22/2016.

public class sort {
    public static void afiseaza(String[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%s ", arr[i]);
    }

    public static void main(String[] args) {
        String[] a = {"Andrei", "Iacob", "Diana", "Raluca", "Xavier", "Amalia"};
        System.out.print("Inainte de sortare: ");
        afiseaza(a);
        System.out.printf("\nDupa sortare: ");
        quickSort(a, 0, a.length - 1);
        afiseaza(a);

    }

    public static void quickSort(String[] a, int start, int end) {
        int i = start;
        int j = end;

        if (j - i >= 1) {
            String pivot = a[i];
            while (j > i) {
                while (a[i].compareTo(pivot) <= 0 && i <= end && j > i) {
                    i++;
                }
                while (a[j].compareTo(pivot) >= 0 && j >= start && j >= i) {
                    j--;
                }
                if (j > i)
                    swap(a, i, j);
            }
            swap(a, start, j);
            quickSort(a, start, j - 1);
            quickSort(a, j + 1, end);
        }
    }

    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}