package L146_LRUCache;

import org.junit.Test;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/13-0:57
 */
public class LruCacheTest {

    @Test
    public void testLruCache(){
        LruCache lruCache = new LruCache(2);
        lruCache.put(2,1);
        lruCache.put(1,1);
        lruCache.put(2,3);
        lruCache.put(4,1);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
        System.out.println(Integer.MAX_VALUE);
    }
}
