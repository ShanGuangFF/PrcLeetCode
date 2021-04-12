package myProxy;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/2-1:08
 */
public class SmsProxy implements SmsService{
    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }


    @Override
    public String send(String message) {
        System.out.println("before send");
        smsService.send(message);
        System.out.println("after send");
        return message;
    }

}
