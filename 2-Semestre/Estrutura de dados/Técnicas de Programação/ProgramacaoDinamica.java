public class ProgramacaoDinamica {
    public static long fibonacci(int n) {
        long[] tabela = new long[n + 1];
        if (n <= 1) return n;
        tabela[0] = 0;
        tabela[1] = 1;
        for (int i = 2; i <= n; i++) {
            tabela[i] = tabela[i - 1] + tabela[i - 2];
        }
        return tabela[n];
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Fibonacci de " + n + " é: " + fibonacci(n));
    }
}