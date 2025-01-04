package forloop;

//### Question 8: Count Vowels

public class forloop8 {
    public static void main(String[] args) {
        String s = "hello world 123123";
        forloop8 countedVowels = new forloop8();

//      System.out.println(countedVowels.countVowels(s));
        int counter = countedVowels.countVowels(s);
        System.out.print(counter);
    }
    public int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
/*### Question 8: Count Vowels

Write a function to count the number of vowels in a given string.

**Function Signature:**
        ```java
public int countVowels(String s)
```

        **Input:**
        - A string `s` (1 ≤ s.length() ≤ 1,000).

        **Output:**
        - Return the count of vowels (a, e, i, o, u) in the string.

        **Example:**
Input: `s = "hello world"`
Output: `3`*/
