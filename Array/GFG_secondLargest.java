class Solution {
    public static int getSecondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
    for (int i=0;i<arr.length;i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] < largest) {
            secondLargest = arr[i];
        }
    }
    return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
}

}
