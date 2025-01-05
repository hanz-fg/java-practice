package forloop;

//### Question 9: Find Second Largest Element

public class forloop9 {
    public static void main(String[] args) {
        int[] arr = {10,20,5,15};

        forloop9 secondLar = new forloop9();
        int result = secondLar.secondLargest(arr);

        System.out.println(result);

    }
    public int secondLargest(int[] arr) {
        //**Input:**
        //- An array of integers `arr` (2 ≤ arr.length ≤ 1,000).
        if (arr == null || arr.length < 2 || arr.length > 1000) {
            throw new IllegalArgumentException("Array length must be between 2 and 1000");
        }

        // much less problematic to
        // int max = arr[0]
        // int secMax = arr[0]
        int max = Math.max(arr[0], arr[1]);
        int secMax = Math.min(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        return secMax;
    }
}
