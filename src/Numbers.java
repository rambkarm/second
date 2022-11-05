public class Numbers {
    // 0001 = 1
    // 0010 = 2 2^1
    // 0011 = 3
    // 0100 = 4 2^2
    // 0101 = 5
    // 0111 = 7
    // 1000 = 8 2^3
    // 1 0000 = 16 2^4
    // 10 0000 = 32 2^5
    // 255 = 1111 1111
    // 255 = 1111 1111 = -128byte
    // 256 = 1 0000 0000 2^8
    public static void main(String[] args) {
        byte a = 127;
        byte a1 = ++a;
        long b = 1000;
        char c = 255;
        System.out.println("a = " + a1 + " b = " + b + " C = " + c);
        int age = 2147483647;
        int age1 = 2147483647 + 2;
        String name = "Rafael";
        if (age < 13){
            System.out.println("My name is " + name + ". My age is " + age1 + ". I am child.");
        }
        else{
            System.out.println("My name is " + name + ". My age is " + age1 + ". I am adult.");
        }
    }
}

