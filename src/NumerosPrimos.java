public class NumerosPrimos {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Insira a lista de inteiros!");
            return;
        }

        for (String s : args) {
            int numero = Integer.parseInt(s);
            Thread thread = new Thread(new Task(numero));
            thread.start();
        }
    }
}