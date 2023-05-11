package app.contexts;

import app.Order;
import app.State;

public class Unprocessed implements State {
    private Order order;

    public Unprocessed(Order order) {
        this.order = order;
    }

    @Override
    public void refreshStatus() {
        System.out.println("Status Pedido - Não Processado.");
    }

    @Override
    public void nextStatus() {
        System.out.println("Pedido sendo preparado...");

        order.setState(new Preparing(this.order));
    }
}
