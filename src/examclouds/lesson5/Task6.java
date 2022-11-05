package examclouds.lesson5;

public class Task6 {

    public static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        ex2();
    }

    private static void ex1() {
        int a = 0;
        do {
            System.out.println(a+=5);
        }
        while (a < MAX_NUMBER);
    }
        private static void ex2() {
        int a = 0;
        do {
            if (a % 5 == 0) {
                System.out.println(a);
            }
            a++;
        }
        while (a < MAX_NUMBER);
    }


}
