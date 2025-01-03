package forloop;

public class forloop3 {
    public static void main(String[] args) {
        int n = 10;

        forloop3 primeCounter = new forloop3();
        int prime = primeCounter.countPrimes(n);

        System.out.print(prime);
    }
    public int countPrimes(int n){
        int primeCount = 0;
        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeCount++;
            }
        }
         return primeCount;
    }
}

//**Input:**
//        - A single integer `n` (2 ≤ n ≤ 10,000).
//
//        **Output:**
//        - Return the number of prime numbers less than `n`.
//**Example:**
//Input: `n = 10`
//Output: `4`
//Explanation: There are 4 prime numbers less than 10: 2, 3, 5,