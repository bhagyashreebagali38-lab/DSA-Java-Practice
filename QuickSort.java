class Quick {

    public static void Quicksort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            Quicksort(arr, lb, loc - 1);
            Quicksort(arr, loc + 1, ub);
        }
    }

    public static int partition(int arr[], int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while (start < end) {

            while (start <= ub && arr[start] <= pivot) {
                start++;
            }

            while (end >= lb && arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                swap(arr, start, end);
            }
        }

        swap(arr, lb, end);
        return end;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = {2, 6, 1, 3, 4, 8};
        int n = arr.length;

        Quicksort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
