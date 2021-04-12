package myProxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/2-1:25
 */
public class DynamicProxy implements InvocationHandler {
    private final Object smsService;

    public DynamicProxy(Object smsService) {
        this.smsService = smsService;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before send" + method.getName());

        Object result = method.invoke(smsService,args);

        System.out.println("after send" + method.getName());

        return result;
    }
}
