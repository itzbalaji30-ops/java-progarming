public class secondlargele {
    public static void main(String[] args) {
        int arr[] = {9, 7, 8, 3, 6};
        int largest = arr[0];
        int secondLargest = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}
