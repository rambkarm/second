package examclouds.lesson5;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int faktarial = 1;
        Random rand = new Random();
        int randomNum = rand.nextInt(6);

        for (int a = 1; a <= randomNum; a++){
            faktarial *= a;
        }
        System.out.println(faktarial);
    }
}
