package mySort;

import org.junit.Test;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/7-0:07
 */
public class myMergeSort {


    public void mergeSort(int[] arr,int left,int right){

        //递归终结条件
        //先分到不能再分,也就是单个元素
        if(left == right)
            return;

        int mid = (left + right)/2;

        //分左序列
        mergeSort(arr,left,mid);
        //分右序列
        mergeSort(arr,mid+1,right);
        //治,也就是合并
        merge(arr,left,mid,right);
    }

    private void merge(int[] arr, int left, int mid, int right) {

        //辅助数组
        int[] temp = new int[right - left + 1];

        int index = 0;
        int low = left;//左序列初始下标
        int high = mid + 1;//右序列初始下标


        while(low <= mid && high <= right){
            temp[index++] = arr[low] < arr[high] ? arr[low++] : arr[high++];
        }

        //右序列越界,复制左序列进数组
        while(low <= mid){
            temp[index++] = arr[low++];
        }

        //左序列越界,复制右序列进数组
        while(high <= right){
            temp[index++] = arr[high++];
        }

        //把元素拷贝给原数组,记得是从left下标开始
        for (int i = 0; i < temp.length; i++) {
            arr[left+i] = temp[i];
        }
    }



    @Test
    public void test(){
        int[] nums = {7,8,9,1,4,10,6,5,5};
        mergeSort(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.print(num+"\t");
        }
    }
}
