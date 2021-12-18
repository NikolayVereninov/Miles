public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addSum = 5000;
        int bonus = 0;
        if (addSum > 1000) {
            bonus = addSum / 100;
            int total = balance + addSum + bonus;
            System.out.println(bonus);
        }
    }
}
