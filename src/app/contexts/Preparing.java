package app.contexts;

import app.Order;
import app.State;

public class Preparing implements State {
    private Order order;

    public Preparing(Order order) {
        this.order = order;
    }
    @Override
    public void nextStatus() {
        System.out.println("Pedido pronto para ser processado...");

        order.setState(new Processed(this.order));
    }

    @Override
    public void refreshStatus() {
        System.out.println("Status Pedido - Preparado.");
    }
}
