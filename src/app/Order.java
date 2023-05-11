package app;

import app.contexts.Unprocessed;

import java.util.concurrent.TimeUnit;

public class Order implements State {
    private State state;

    public Order() {
        this.state = new Unprocessed(this);
    }

    @Override
    public void nextStatus() {
        state.nextStatus();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void refreshStatus() {
        state.refreshStatus();
    }
}
