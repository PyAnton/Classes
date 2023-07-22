package model.data;


import model.Data;

public class WalletData implements Data {
    private double balance;
    private double changeBalance;

    public WalletData(double balance, double changeBalance) {
        this.balance = balance;
        this.changeBalance = changeBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getChangeBalance() {
        return changeBalance;
    }



    @Override
    public String toString() {
        return "WalletData{" +
                "balance=" + balance +
                ", changeBalance=" + changeBalance +
                '}';
    }
}
