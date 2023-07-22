import model.UpdateData;
import model.UpdateType;
import model.data.AccountData;
import model.data.WalletData;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        UpdateData updateData1 = new UpdateData(UpdateType.ACCOUNT,"2");//Получили обновление данных по Аккаунту 2 ордера..
        UpdateData updateData2 = new UpdateData(UpdateType.WALLET,"263 -32.5");//Получили обновление данных по Кошельку 263 бакса и -32.5 изменение..
        System.out.println(updateData1.getData());//тут мы не можем обратиться к методам класса AccountUpdate хотя это его данные
        System.out.println(updateData2.getData());//тут мы не можем обратиться к методам класса WalletUpdate хотя это его данные

    }
}