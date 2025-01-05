import question.IntersectionLine;

public class TestMain {

    static final IntersectionLine t = new IntersectionLine();
    public static void main(String[] args) {
        Test01();
        Test02();
        Test03();
    }
    public static void Test01(){
        IntersectionLine.Point a1 = new IntersectionLine.Point(2, 0);
        IntersectionLine.Point a2 = new IntersectionLine.Point(3, 1);
        IntersectionLine.Point b1 = new IntersectionLine.Point(1, 2);
        IntersectionLine.Point b2 = new IntersectionLine.Point(2, 1);
        System.out.println(t.croseLine(a1, a2, b1, b2));
    }
    public static void Test02(){
        IntersectionLine.Point a1 = new IntersectionLine.Point(2, 0);
        IntersectionLine.Point a2 = new IntersectionLine.Point(2, 1);
        IntersectionLine.Point b1 = new IntersectionLine.Point(1, 2);
        IntersectionLine.Point b2 = new IntersectionLine.Point(2, 1);
        System.out.println(t.croseLine(a1, a2, b1, b2));
    }
    public static void Test03(){
        IntersectionLine.Point a1 = new IntersectionLine.Point(0, 0);
        IntersectionLine.Point a2 = new IntersectionLine.Point(2, 0);
        IntersectionLine.Point b1 = new IntersectionLine.Point(1, 1);
        IntersectionLine.Point b2 = new IntersectionLine.Point(3, 1);
        System.out.println(t.croseLine(a1, a2, b1, b2));
    }
}
