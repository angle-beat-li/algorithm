package DesignPattern.SingletonPattern;

/**
 * SlackerStyle$
 *
 * @author fldsjj-liy
 * @date 2023/10/18$
 */
public class SlackerStyle {
    private static SlackerStyle instance;
    public SlackerStyle(){};
    public static synchronized SlackerStyle getInstance(){
        if (instance == null) {
            instance = new SlackerStyle();
        }
        return instance;
    }
}
