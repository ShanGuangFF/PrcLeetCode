package myInvoke;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试反射
 * @author cc_ff
 * @creat 2021-04-2021/4/2-0:40
 */
public class testInvoke {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        //获取targetObject类并获取实例
        Class<?> aClass = Class.forName("myInvoke.TargetObject");
        TargetObject targetObject =(TargetObject) aClass.newInstance();

        //获取类中所有定义方法
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        //获取指定方法并调用
        Method publicMethod = aClass.getMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject," sb");

        //对指定参数修改
        Field filed = aClass.getDeclaredField("str");
        filed.setAccessible(true);
        filed.set(targetObject,"FF");

        //调用私有方法
        Method privateMethod = aClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);

    }
}
