package ContainsDuplicate;

import org.junit.Test;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/6-22:57
 */
public class test {

    @Test
    public void test(){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int [] ints = {1,2,3,1};
        int [] ints1 = {1,2,3,4};
        int [] ints2 = {1,1,1,3,3,4,3,2,4,2};
        boolean b = containsDuplicate.containsDuplicate2(ints1);
        System.out.println(b);

    }

}
