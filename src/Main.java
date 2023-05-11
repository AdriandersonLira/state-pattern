import app.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    Thread t;
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        Order order = new Order();
        Main main = new Main();

        while (true) {
            System.out.println("Escolha alguma opção abaixo:");
            System.out.println("1 - Fazer novo pedido.");
            System.out.println("2 - Parar Serviço");
            System.out.print("Digite a opção: ");

            int option = Integer.parseInt(buffReader.readLine());

            if (option == 1) {
                // Preparing
                order.refreshStatus();
                order.nextStatus();

                // Unprocessed
                main.handleProcessing();
                order.refreshStatus();
                order.nextStatus();

                // Processed
                order.refreshStatus();
                order.nextStatus();

                // Shipping
                order.refreshStatus();
                main.handleProcessing();
                order.nextStatus();

                // Completed
                order.refreshStatus();
                order.nextStatus();
            } else {
                System.out.println("Obrigado, Volte Sempre!");
                break;
            }
        }
    }

    public void handleProcessing() throws InterruptedException, IOException {
        String anim= "|/-|\\-";
        for (int x = 0 ; x <= 100 ; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x + "%";
            System.out.write(data.getBytes());
            Thread.sleep(100);
        }
        System.out.println();
    }
}