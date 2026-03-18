
public class Main {

    public static void sayHello(int n) { // caso base função recusiva 

        if (n == 10) {
            System.out.println(n);
        } else {
            System.out.println(n);
            sayHello(n + 1);
        }

    }

    public static void main(String[] args) {

        sayHello(0);

    }

}

/// caso base execuntação de parada 
