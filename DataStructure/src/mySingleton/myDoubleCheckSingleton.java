package mySingleton;



/**
 *
 * 双重校验锁方式实现单例模式
 * @author cc_ff
 * @creat 2021-04-2021/4/6-18:13
 */
public class myDoubleCheckSingleton {

    //要用volatile修饰禁止指令重排
    private volatile static myDoubleCheckSingleton uniqueInstance;


    public static myDoubleCheckSingleton getUniqueSingleton(){


        //如果空才进入加锁
        if (uniqueInstance == null){
            //加的是类锁
            synchronized (myDoubleCheckSingleton.class){
                if (uniqueInstance == null) {
                    uniqueInstance = new myDoubleCheckSingleton();
                }
            }
        }
        return uniqueInstance;

    }
}
