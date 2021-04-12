package minArray;

/**
 * 数组中最小数
 * @author cc_ff
 * @creat 2021-03-2021/3/8-19:18
 */
public class minArraySolution {
    public int minArray(int[] numbers) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        int midIndex = index1;
        while(numbers[index1] >= numbers[index2]){
            if(index2-index1 == 1){
                midIndex = index2;
                break;
            }

            midIndex = (index1 + index2) / 2;
            if(numbers[index1] == numbers[index2] &&numbers[midIndex] ==numbers[index1]){
                return MinInOrder(numbers);
            }else if(numbers[midIndex] >= numbers[index1]){
                index1 = midIndex;
            }else if(numbers[midIndex] <= numbers[index2]){
                index2 = midIndex;
            }

        }
        return numbers[midIndex];
    }

    public int MinInOrder(int[] numbers){
        int minNum = numbers[0];
        for(int i = 0;i < numbers.length ;i++){
            if(numbers[i] <= minNum)
                minNum = numbers[i];
        }
        return minNum;
    }

    public int minArray_Math(int[] numbers){
        int indexR = 0;
        int indexL = numbers.length - 1;
        int midIndex = 0;
        while(indexR < indexL){
            midIndex = (indexR + indexL)/2;
            if(numbers[midIndex] > numbers[indexL]){
                indexR = midIndex + 1;
            }else if(numbers[midIndex] < numbers[indexL]){
                indexL = midIndex;
            }else{
                indexL--;
            }
        }
        return numbers[indexL];
    }
}
