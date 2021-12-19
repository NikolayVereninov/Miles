public class Main {
    public static void main(String[] args) {
        int balance = 350;
        int addMoney = 2000;
        int bonus = 0;
        if (addMoney > 1000) {
            bonus = (addMoney / 100);
        }
        int total = balance + addMoney + bonus;
        System.out.println(bonus + balance + addMoney);
    }
}
