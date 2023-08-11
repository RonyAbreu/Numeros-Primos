public class Task implements Runnable {
    private final int numero;

    public Task(int numero) {
        this.numero = numero;
    }

    public void run() {
        if (ehPrimo(numero)){
            System.out.println(numero + " é primo! " + Thread.currentThread().getName());
        } else {
            System.out.println(numero + " não é primo! " + Thread.currentThread().getName());
        }
    }

    public boolean ehPrimo(int numero){
        return !(numero <= 1 | (numero != 2 && numero % 2 == 0) | (numero != 3 && numero % 3 == 0));
    }
}