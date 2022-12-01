package examclouds.lesson7.lesson.task3;

public class DemoBox1 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(3.3, 4.4, 5.5);
        Box box3 = new Box(234.43, 234.45, 11.34);
//        box1.setData(34.44, 34.55, 0.99);
        box1.setDepth(23.35);
        box1.setHeight(23.35);
        box1.setWidth(23.35);
        double result = box1.getVolume();
        System.out.println(box1.getVolume());
        Box[] boxes = new Box[]{box1, box2, box3};
        for (int i = 0; i < boxes.length; i++) {
            System.out.println(boxes[i].toString());
        }
    }
}

