package myProxy;

import java.lang.reflect.Proxy;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/2-1:30
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DynamicProxy(target)
        );
    }
}

