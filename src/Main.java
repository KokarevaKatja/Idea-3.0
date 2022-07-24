public class Main {
    public static void main(String[] args) {

        int account = 600;
        int credit = 1200;
        int bonus;

        if (credit > 1000) {
            bonus = credit / 100;
        } else {
            bonus = 0;
        }

        int total = account + credit + bonus;

        System.out.println(total);
        System.out.println(bonus);
    }
}
