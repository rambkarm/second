package begin;

public class Square {
    public static void main(String[] args) {
        int x;
        int y;
        x = square(2);



        System.out.println(x);
        x = square(4);
        System.out.println(x);
        y = 6;
        x = square(y);
        System.out.println(x);
    }

    public static int square(int i) {
        return i * i;
    }
}
