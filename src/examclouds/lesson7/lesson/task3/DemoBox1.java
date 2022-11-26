package examclouds.lesson7.lesson.task3;

public class DemoBox1 {
    public static void main(String[] args) {
        Box box1 = new Box();

        double a = box1.depth = 78.88;
        double b = box1.height = 56.79789;
        double c = box1.width = 456.77;
        double volume = a * b * c;
        System.out.println(volume);
    }
}
