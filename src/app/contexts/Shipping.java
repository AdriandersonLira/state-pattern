package app.contexts;

import app.Order;
import app.State;

public class Shipping implements State {
    private Order order;

    public Shipping(Order order) {
        this.order = order;
    }

    @Override
    public void refreshStatus() {
        System.out.println("Status Pedido - No caminho...");
    }

    @Override
    public void nextStatus() {
        order.setState(new Completed(this.order));
    }
}
