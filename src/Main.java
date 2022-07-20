public class Main {
    public static void main(String[] args) {

        int x = 600;
        int y = 1200;
        int f;

        if (y > 1000) {
            f = y / 100;
        } else {f = 0;}

        int z = x + y + f;

        System.out.println(z);
        System.out.println(f);
    }
}
