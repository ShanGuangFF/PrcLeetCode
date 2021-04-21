package mySort;

import org.junit.Test;

public class solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public int[] MySort (int[] arr) {
        quickSort(arr,0,arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr,int left,int right){

        //随机一个主元
        if(left <right){
            swap(arr,left+(int)(Math.random()*(right -left+1)),right);
            int[] pivot = partition(arr,left,right);
            quickSort(arr,left,pivot[0]-1);
            quickSort(arr,pivot[0]+1,right);
        }
    }

    private int[] partition(int[] arr,int left,int right){
        int low = left - 1;
        int high = right;
        int current = left;
        while(current < high){
            if(arr[right] > arr[current]){
                swap(arr,++low,current++);

            }else if(arr[right] == arr[current]){
                current++;
            }else{
                swap(arr,current,--high);
            }
        }

        swap(arr,right,high);
        return new int[]{low+1,high};
    }

    private void swap(int[] arr,int index1,int index2){
        int tmp;
        tmp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=tmp;
    }

    @Test
    public void test(){
        int[] nums = {7,8,9,1,4,10,6,5,5};
        quickSort(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.print(num+"\t");
        }
    }
}