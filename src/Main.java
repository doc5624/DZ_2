public class Main {
    public static void main(String[] args) {
        int счет = 500;
        int сумма_пополнения = 1350;
        int casch = 100;
        int bonus;

        if (сумма_пополнения > 1000) {
            bonus = сумма_пополнения / casch;
        } else {
            bonus = 0;
        }

        int баланс = счет + сумма_пополнения + bonus;


        System.out.println("Баланс: " + баланс + " рублей");
        System.out.println("Количество начисленых бонусов: " + bonus);
    }
}