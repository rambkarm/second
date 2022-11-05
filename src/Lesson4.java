public class Lesson4 {
    public static void main(String[] args) {
//        forTick1();
//        forTick2();
        printChar();
    }

    private static void printChar() {
        char smile = 100;
        char h = 'h';
        for (char ch = 9994; ch < 10000; ch++) {
            System.out.print("Hello world" + ch);
        }
    }

    private static void forTick1() {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println("Tick " + i);
            }
        }
    }

    private static void forTick2() {
        for (int i = 0; i < 10; i += 3) {
            System.out.println("Tick " + i);
        }
    }
}
