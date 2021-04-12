package myProxy;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/2-1:07
 */
public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("send message: "+message);
        return message;
    }
}
