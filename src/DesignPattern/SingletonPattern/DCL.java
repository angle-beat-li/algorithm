package DesignPattern.SingletonPattern;

/**
 * DCL$ 双重锁校验
 *
 * @author fldsjj-liy
 * @date 2023/10/18$
 */
public class DCL {
    private volatile static DCL instance;
    public DCL(){};
    public static DCL getInstance() {
        if(instance == null) {
            synchronized(DCL.class){
                if(instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }
}
