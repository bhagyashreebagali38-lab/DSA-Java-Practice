import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Kadane's Algorithm
        int maxSum = arr[0];
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum = sum + arr[i];

            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        // Output
        System.out.println(maxSum);
    }
}
