package DesignPattern.SingletonPattern;

/**
 * SlackerStyle02$
 *
 * @author fldsjj-liy
 * @date 2023/10/18$
 */
public class HungryMan {
    private static HungryMan instance = new HungryMan();
    public HungryMan(){};
    public static synchronized HungryMan getInstance() {
        return instance;
    }
}
