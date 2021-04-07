public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int amount = 1500;
        int bonus = 1;
        int totalBalance;

        if (amount > 1000) {
            totalBalance = accountBalance + (amount + (amount / 100) * 1);
        }
        else  {
            totalBalance = accountBalance + amount;
        }
        System.out.println(totalBalance);}
}