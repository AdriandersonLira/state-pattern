package app.contexts;

import app.Order;
import app.State;

public class Completed implements State {
    Order order;

    public Completed(Order order) {
        this.order = order;
    }
    @Override
    public void nextStatus() {

    }

    @Override
    public void refreshStatus() {
        System.out.println("Status - Entregue!");
    }
}
