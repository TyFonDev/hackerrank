class Test {

    public static void main(String[] args) {
        // Algunos casos de prueba.
        int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
        int x3 = 0, v3 = 2, x4 = 5, v4 = 3;
        int x5 = 1113, v5 = 612, x6 = 1331, v6 = 610;

        System.out.println(kangaroo(x1, v1, x2, v2)); // expected YES
        System.out.println(kangaroo(x3, v3, x4, v4)); // expected NO
        System.out.println(kangaroo(x5, v5, x6, v6)); // expected YES
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        return v2 < v1 && (x1 - x2) % (v2 - v1) == 0 ? "YES" : "NO";
    }
}


