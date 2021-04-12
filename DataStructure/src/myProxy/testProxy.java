package myProxy;

import org.junit.Test;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/2-1:10
 */
public class testProxy {

    @Test
    public void testStaticProxy(){
        SmsService smsService = new SmsServiceImpl();
        SmsProxy proxy = new SmsProxy(smsService);
        proxy.send("FF");
    }


    @Test
    public void testDynamicProxy(){
        SmsService smsService =(SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("FF");
    }

}
