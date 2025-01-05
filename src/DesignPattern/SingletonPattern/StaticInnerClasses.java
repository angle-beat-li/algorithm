package DesignPattern.SingletonPattern;

/**
 * StaticInnerClasses$
 *
 * @author fldsjj-liy
 * @date 2023/10/18$
 */
public class StaticInnerClasses {
    private static class SingletonHolder{
        public static final StaticInnerClasses instance = new StaticInnerClasses();
    }
    public StaticInnerClasses(){};
    public static final StaticInnerClasses getInstance() {
        return SingletonHolder.instance;
    }

}
