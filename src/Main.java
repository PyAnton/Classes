import model.Data;
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

        //Ошибка
        //System.out.println(updateData1.getData().getOrders());
        // getOrders() не работает как сделать что бы работал??


        // Создаем объект UpdateData с UpdateType.ACCOUNT
        UpdateData updateData = new UpdateData(UpdateType.ACCOUNT, "222");

        // Получаем объект Data
        Data data = updateData.getData();

        // Проверяем, является ли объект Data экземпляром AccountData
        if (data instanceof AccountData) {
            // Приводим объект Data к типу AccountData
            AccountData accountData = (AccountData) data;

            // Теперь можем получить значение orders
            int orders = accountData.getOrders();
            System.out.println("Orders: " + orders);
        } else if (data instanceof WalletData) {
            // Приводим объект Data к типу AccountData
            WalletData walletData = (WalletData) data;

            // Теперь можем получить значение orders
            double balance = walletData.getBalance();
            double change = walletData.getBalance();
            System.out.println("Orders: " + balance);
            System.out.println("Change: " + change);
        } else {
            System.out.println("Data is not of type Data.");
        }
    }
}
//Помните, что в этом примере используется предположение, что данные в строке "5" (в dataString) представляют количество заказов для AccountData. В реальном приложении вы должны убедиться, что данные соответствуют ожидаемому формату, чтобы избежать ошибок при преобразовании.

