import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números deseja inserir ?");
        int quantNumeros = sc.nextInt();

        ExecutorService pool = java.util.concurrent.Executors.newFixedThreadPool(quantNumeros);
        System.out.println("Digite os números: ");
        for (int i = 0; i< quantNumeros; i++){
             int numerosDaLista = sc.nextInt();
             pool.execute(new Task(numerosDaLista));
        }
        pool.shutdown();
    }
}