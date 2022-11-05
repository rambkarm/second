public class Hw03 {
    public static void main(String[] args) {
        int a = 5;
        printNumberIfOdd(a);
        numberFromZeroToTen(a);
        weekDays(a);
    }

    private static void printNumberIfOdd(int a) {
        if (a % 2 != 0) {
            System.out.println(a);
        }
    }

    public static void numberFromZeroToTen(int a) {
        if ((a >= 0) && (a <= 10)) {
            System.out.println("Положительное число меньше 10 или 0.");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное.");
        }
    }


    public static void weekDays(int a) {
        if (a == 1) {
            System.out.println("Понедельник");
        } else if (a == 2) {
            System.out.println("Вторник");
        } else if (a == 3) {
            System.out.println("Среда");
        } else if (a == 4) {
            System.out.println("Четверг");
        } else if (a == 5) {
            System.out.println("Пятница");
        } else if ((a == 6) || (a == 7)) {
            System.out.println("Выходной");
        }
    }
}