package app.contexts;

import app.Order;
import app.State;

public class Processed implements State {
    private Order order;

    public Processed(Order order) {
        this.order = order;
    }

    @Override
    public void refreshStatus() {
        System.out.println("Status Pedido - Processado.");
    }

    @Override
    public void nextStatus() {
        order.setState(new Shipping(this.order));
    }
}
