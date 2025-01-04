package forloop;

//### Question 6: Find Maximum in Array

public class forloop6 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 2};

        forloop6 maxNumber = new forloop6();
        int maximum = maxNumber.findMax(arr);

        System.out.print(maximum);
    }
    public int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
