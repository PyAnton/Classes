package model.data;

import model.Data;

public class AccountData implements Data {
    private int orders;

    public AccountData(int orders) {
        this.orders = orders;
    }

    public int getOrders() {
        return orders;
    }


    @Override
    public String toString() {
        return "AccountData{" +
                "orders=" + orders +
                '}';
    }
}
