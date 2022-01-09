import java.math.BigInteger;

public class FibonacciModified {
    public static void main(String[] args) {
        // Algunos casos de prueba.
        Integer t1 = 0, t2 = 1, n1 = 5;
        Integer t3 = 0, t4 = 1, n2 = 10;

        System.out.println(fibonacciModified(t1, t2, n1)); // expected 5
        System.out.println(fibonacciModified(t3, t4, n2)); // expected 84266613096281243382112
    }

    public static BigInteger fibonacciModified(Integer t1, Integer t2, Integer n) {
        // Write your code here
        if (n == 0) return BigInteger.valueOf(t1);
        if (n == 1) return BigInteger.valueOf(t2);


        BigInteger a = BigInteger.valueOf(t1);
        BigInteger b = BigInteger.valueOf(t2);

        for (int i = 2; i < n; i++) {
            BigInteger next = b.multiply(b).add(a);
            a = b;
            b = next;
        }

        return b;
    }

}
