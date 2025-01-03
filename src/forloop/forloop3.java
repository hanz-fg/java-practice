package forloop;

//### Question 3: Count

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
