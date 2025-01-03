package forloop;

//### Question 2: Reverse an Array

public class forloop2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        forloop2 reverseArr = new forloop2();
        int[] reverse = reverseArr.reverseArray(arr);

        for (int i = 0; i < reverse.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(reverse[i]);
        }
    }
    public int[] reverseArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;

        }
        return arr;
    }
}
