import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array=new int[] {28,6,41,20,33,17,9,95,71};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    //递归调用快速排序算法
    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if(startIndex>=endIndex) {
            return;
        }
        //基准元素的产生方法
        int pivotIndex=partition(array,startIndex,endIndex);
        quickSort(array,startIndex,pivotIndex-1);
        quickSort(array,pivotIndex+1,endIndex);
    }

    //单边循环的实现，找到基准点
    private static int partition(int[] array, int startIndex, int endIndex) {
        //基准点，当前数组的第一个元素作为基准点使用。
        int pivot=array[startIndex];
        //标记指针----->实现单边循环的关键对象，从当前数组的起点开始
        int mark=startIndex;
        //单边的具体实现
        for(int i=startIndex+1; i<=endIndex; i++) {
            //基准点大于当前i所在的元素，就要让mark标记自动加一，移动下一个位置，并将当前位置的元素与i除的元素进行交换即可。
            if(pivot>array[i]) {
                mark++;
                int temp=array[i];
                array[i]=array[mark];
                array[mark]=temp;
            }
        }
        //一次下来，将基准点与mark相互换位置
        array[startIndex]=array[mark];
        array[mark]=pivot;
        return mark;
    }
}
