package question;

public class IntersectionLine {

    /**
     * 对于两线段的相交问题处理。
     * 线段AB(a1(x,y),a2(x,y)),线段CD(c1(x,y),c2(x,y))
     * 如何判断两条线段是否相交。
     * 1. 先计算俩者的映射在x轴或者y轴上是否有重合，没有则一定不相交
     *      max(a1.x,a2.x) < min(b1.x,b1.y) || max(a1.y,a2.y) < min(b1.y,b2.y)
     *      || min(a1.x,a2.x) > max(b1.x,b2.x) || min(a1.y,a2.y) > max(b1.y,b2.y)
     * 2. 通过向量计算是否交叉。
           重要概念，对于向量AB，CD有，AB \* CD如果该值小于零，说明CD在AB的逆时针方向上，如果该值大于零，说明CD在AB的顺时针方向上。
           同时有向量叉乘概念，`a1a2 * b1b2 = (a1a2.x * b1b2.y) - (a1a2.y * b1b2.x)`
           对于俩个条线段a2a1,b2b1,我们可以得到条件，如果俩者相交就一定有a1,a2在b2b1两侧，
           即`b2a2 * b2b1 * b2a1 * b2b1 < 0`,且有b1,b2在a1a2两侧，即`a2b1 * a2a1 * a2b2 * a2a1 < 0`。
           同时满足，就可以得证a1a2与b1b2相交。
     */
    public static class Point{
        double x;
        double y;
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
    private double compute(Point a1,Point a2,Point b){
        return (a1.x - b.x) * (a2.y - a1.y) - (a1.y - b.y) * (a2.x - a1.x);
    }
    private boolean quickScreen(Point a1, Point a2, Point b1, Point b2){
        if(Math.min(a1.x, a2.x) > Math.max(b1.x, b2.x) || Math.min(a1.y, a2.y) > Math.max(b1.y, b2.y)
        || Math.max(a1.x, a2.x) < Math.min(b1.x, b2.x) || Math.max(a1.y, a2.y) < Math.min(b1.y, b2.y)) {
            return false;
        }
        return true;
    }
    public boolean croseLine(Point a1, Point a2, Point b1,Point b2){
        if(!quickScreen(a1, a2, b1, b2)){
            return false;
        }
        if(compute(a1, a2, b1) * compute(a1, a2, b2) > 0 ||
            compute(b1, b2, a1) * compute(b1, b2, a2) > 0
        ){
            return false;
        }
        return true;
    }
}