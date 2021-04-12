package listToArray;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/1-23:21
 */
public class myArrays {


    static <T> List<T> arrayToList(final T[] array){
        final List<T> list = new ArrayList<T>(array.length);

        for (T t : array) {
            list.add(t);
        }

        return list;
    }



    @Test
    public void arrayToListTest(){
        Integer[] arrayInt = {1,2,3};

        List<Integer> integerListArrays = Arrays.asList(arrayInt);
        System.out.print("Arrays中的asList："+integerListArrays+"\t\t");
        System.out.println(integerListArrays.getClass());


        //自定义arrayToList
        List<Integer> integerList = arrayToList(arrayInt);
        System.out.print("自定义arrayToList"+integerList+"\t\t");
        System.out.println(integerList.getClass());

        //java8的Stream
        List<Integer> integerListStream = Arrays.stream(arrayInt).collect(Collectors.toList());
        System.out.print("java8流操作转换："+integerListStream+"\t\t");
        System.out.println(integerListStream.getClass());

        //java9中的List.of
        //List<Integer> arrayIntListOf = List.of(arrayInt);
        //System.out.print("java9中的List.of()："+integerListStream+"\t\t");
        //System.out.println(integerListStream.getClass());
    }
























}
