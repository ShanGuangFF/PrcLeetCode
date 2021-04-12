package mySort;

import org.junit.Test;



/**
 * @author cc_ff
 * @creat 2021-03-2021/3/17-23:07
 */


public class mySort {


    /**
     * 冒泡算法:一次冒泡,把n各数中最大的交换到末尾,时间复杂度n方,最好为n
     * @param nums
     * @return
     */
    public int[] BubbleSort(int[] nums){

        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {


            //一趟冒泡
            for (int j = 0; j < nums.length - i - 1; j++) {
                //大于则交换,升序
                if (nums[j] > nums[j+1]){
                    nums[j] = nums[j] ^ nums[j+1];
                    nums[j+1] = nums[j] ^ nums[j+1];
                    nums[j] = nums[j] ^ nums[j+1];

                    //发生了交换
                    flag = true;
                }

            }

            //没有发生交换则推出,说明已经有序
            if(!flag)
                break;
        }

        return nums;
    }


    /**
     * 快速排序:分治思想,一次划分,找出一个基准元素,左边的比他小,右边的比他大,然后进行左子列递归,右子列递归
     * 空间复杂度(log2n),时间复杂度(nlog2n)
     * @param nums
     * @param low
     * @param high
     * @return
     */
    public int[] quickSort(int[] nums,int low,int high){

        //当i = j递归结束
        if (low < high){
            int pivot = partition(nums,low,high);
            quickSort(nums,0,pivot-1);
            quickSort(nums,pivot+1,high);
        }

        return nums;
    }

    private int partition(int[] nums,int low,int high ){
        //一次划分找出中心点,一般把第一个当作哨兵
        int pivot = nums[low];

        //low < high相等时跳出
        while(low < high){

            //默认第一个为哨兵,所以从高位找起,找小于哨兵,赋给低位
            while(low < high && pivot <= nums[high])
                high--;

            nums[low] = nums[high];

            //高位元素已存在,从低位开始找大于哨兵的元素
            while (low < high && pivot >= nums[low])
                low++;
            nums[high] = nums[low];

        }

        //将哨兵元素放入中间位置
        nums[low] = pivot;

        //此时的中心点low = high,随便返回一个
        return low;
    }




    @Test
    public void test(){
        int[] nums = {7,8,9,1,4,10,6,5,5};
        int[] numsQuick = quickSort(nums,0,nums.length-1);

        int[] numsBubble = BubbleSort(nums);

        for (int num : numsQuick) {
            System.out.print(num+"\t");
        }

        System.out.println();

        for (int num : numsBubble) {
            System.out.print(num+"\t");
        }
    }
}
