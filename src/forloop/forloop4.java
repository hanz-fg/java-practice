package forloop;

//### Question 4: FizzBuzz

import java.util.ArrayList;
import java.util.List;

public class forloop4 {
    public static void main(String[] args) {
        int n = 5;

        forloop4 resultFizBuzz = new forloop4();
        List<String> resFix = resultFizBuzz.fizzBuzz(n);

        System.out.println(resFix);
    }
    public List<String> fizzBuzz(int n){
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                list.add("FizzBuzz");
            }else if (i % 3 == 0) {
                list.add("Fizz");
            }else if (i % 5 == 0){
                list.add("Buzz");
            }else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
//Write a function that returns a list of strings r
//epresenting the numbers from 1 to `n`. For multiples
//of 3, return “Fizz” instead of the number, and for multiples
//of 5, return “Buzz”. For numbers that are multiples of both 3
//and 5, return “FizzBuzz”.
