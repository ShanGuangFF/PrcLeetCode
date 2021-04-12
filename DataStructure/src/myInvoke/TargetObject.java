package myInvoke;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/2-0:38
 */
public class TargetObject {
    private String str;

    public TargetObject(){
        str = "shanGuangFF";
    }

    public void publicMethod (String s){
        System.out.println("I am"+s);
    }

    private void privateMethod(){
        System.out.println("str is "+str);
    }


}
