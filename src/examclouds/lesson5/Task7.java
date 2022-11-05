package examclouds.lesson5;

public class Task7 {
    public static void main(String[] args) {
        ex3();
    }

    private static void ex1() {
        char letter = 'a';
        for (int i = 0; i < 10; i++){
            System.out.print(letter++);
        }
    }

    private static void ex2() {
        for (char letter = 'a'; letter < 'a' + 10; letter++){
            System.out.print(letter);
        }
    }

    private static void ex3() {
        for (char letter = 'a'; letter < 'a' + 10;){
            System.out.print(letter++);
        }
    }


}
