public class Main {
    public static void main(String[] args) {
        int account = 500;
        int amountDeposit = 1350;
        int casch = 100;
        int bonus;

        if (amountDeposit > 1000) {
            bonus = amountDeposit / casch;
        } else {
            bonus = 0;
        }

        int balance = account + amountDeposit + bonus;

        System.out.println("Баланс: " + balance + " рублей");
        System.out.println("Количество начисленых бонусов: " + bonus);
    }
}