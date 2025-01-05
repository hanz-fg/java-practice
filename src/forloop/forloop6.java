package forloop;

//### Question 6: Find Maximum in Array


public class forloop6 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,9,2};

        forloop6 maxNum = new forloop6();
        int num = maxNum.findMax(arr);

//        for (int i = 0; i < arr.length; i++) {
//            if (i > arr.length){
//                System.out.print(",");
//            }
//        } just for ","
        System.out.print(num);
    }
    public int findMax(int[] arr){
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
    }

}
//Write a function to find the maximum value in an array of integers.
//
//**Function Signature:**
//        ```java
//public int findMax(int[] arr)
//```
//
//        **Input:**
//        - An array of integers `arr` (1 ≤ arr.length ≤ 1,000).
//
//        **Output:**
//        - Return the maximum value in the array.
//
//**Example:**
//Input: `arr = [1, 5, 3, 9, 2]`
//Output: `9`
