package model;


import model.data.*;

public class UpdateData {
    private UpdateType updateType;
    private Data data;

    public UpdateData(UpdateType updateType, String data) {
        this.updateType = updateType;
        if (updateType == UpdateType.ACCOUNT) {
            this.data = new AccountData(Integer.parseInt(data));
        } else if (updateType == UpdateType.WALLET) {
            String[] arr = data.split(" ");
            this.data = new WalletData(Double.parseDouble(arr[0]),Double.parseDouble(arr[1]));
        }
    }

    public UpdateType getUpdateType() {
        return updateType;
    }

    public Data getData() {
        return data;
    }
}
