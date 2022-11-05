package examclouds.lesson5;

public class Task5 {
    public static void main(String[] args) {
//        var1();
        var2();
    }

    private static void var2() {
        int count = 10;
        while(count != 0){
            System.out.println("tick" + count);
            count --;
        }
    }

    private static void var1() {
        int count = 1;
        while (count <= 10){
            System.out.println("tick" + count);
            count ++;
        }
    }
}

// сделать задание 6 7 9
